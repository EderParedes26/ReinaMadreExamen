package com.example.reinamadreexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nombre,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.nombreUsuario);
        contra = (EditText) findViewById(R.id.contraUsuario);
    }
    public void registrar(View view){
        startActivity(new Intent(this, RegistroAdmin.class));
    }
    public void consultar(View view){
        startActivity(new Intent(this, CRUD.class));
        /*
        AdminSqliteOpenHelper admin=new AdminSqliteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase BaseDatos=admin.getWritableDatabase();
        String usuario=nombre.getText().toString();
        String contras=contra.getText().toString();
        if (!usuario.isEmpty()&&!contras.isEmpty()){
            Cursor fila = BaseDatos.rawQuery("select contra from administradores where nombre = "+usuario,null);
            if(fila.moveToFirst()){
                if (fila.getString(0).equals(contras)){
                    Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
                BaseDatos.close();
            }else{
                Toast.makeText(this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    */
    }
}