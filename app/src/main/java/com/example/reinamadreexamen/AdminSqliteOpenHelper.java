package com.example.reinamadreexamen;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSqliteOpenHelper extends SQLiteOpenHelper{
    public AdminSqliteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase baseDeDatos) {
        baseDeDatos.execSQL("create table administradores(" +
                "id int primary key," +
                "nombre text, " +
                "aPaterno text," +
                "aMaterno text," +
                "contra text)");
        baseDeDatos.execSQL("create table empleados(nombre text," +
                "fechaN date," +
                "correo text," +
                "genero text," +
                "telefono int," +
                "celular int," +
                "fechaI date)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
