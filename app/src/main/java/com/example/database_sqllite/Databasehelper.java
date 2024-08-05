package com.example.database_sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Databasehelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="student.db";

    public static final String TABLE_NAME="student_table";

    public static final String COL1="id";

    public static final String COL2="name";

    public static final String COL3="marks";

    public Databasehelper( Context context) {
        super(context, DATABASE_NAME,  null,  1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
