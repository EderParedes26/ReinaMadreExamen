package com.example.reinamadreexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroAdmin extends AppCompatActivity {
    private EditText nombre,apellidoP,apellidoM,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_admin);
        nombre = (EditText)findViewById(R.id.nombre);
        apellidoP = (EditText)findViewById(R.id.aPaterno);
        apellidoM = (EditText)findViewById(R.id.aMaterno);
        contra = (EditText)findViewById(R.id.contras);
    }

    public void registrar(View view){
        AdminSqliteOpenHelper admin=new AdminSqliteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase BaseDatos = admin.getWritableDatabase();

        String nombreAdmin  = nombre.getText().toString();
        String aPaternoAdmin = apellidoP.getText().toString();
        String aMaternoAdmin = apellidoM.getText().toString();
        String contraAdmin = contra.getText().toString();

        if(!nombreAdmin.isEmpty()&&!aPaternoAdmin.isEmpty()&&!aMaternoAdmin.isEmpty()){
            ContentValues registro = new ContentValues();
            int numero = (int)(Math.random()*10+1);
            registro.put("id",nombreAdmin+""+numero);
            registro.put("nombre",nombreAdmin);
            registro.put("aPaterno",aPaternoAdmin);
            registro.put("aMaterno",aMaternoAdmin);
            registro.put("contra",contraAdmin);
            BaseDatos.insert("administradores",null,registro);
            BaseDatos.close();
            nombre.setText("");
            apellidoP.setText("");
            apellidoM.setText("");
            contra.setText("");
            Toast.makeText(this,"Registro con exito!",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Debes llenar todos los campos",Toast.LENGTH_SHORT).show();
        }
    }
}