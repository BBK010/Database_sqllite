package com.example.database_sqllite;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText id_txt,name_txt,marks_text;

    Button insert_btn, view_btn, edit_btn, delete_btn;

        Databasehelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        id_txt=findViewById(R.id.txt_id);
        name_txt=findViewById(R.id.txt_name);
        marks_text=findViewById(R.id.txt_marks);
        insert_btn=findViewById(R.id.btn_insert);
        view_btn=findViewById(R.id.btn_view);
        edit_btn=findViewById(R.id.btn_edit);
        delete_btn=findViewById(R.id.btn_delete);

            myDB=new Databasehelper( this);
        //Click to insert data
        insert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean inserted=myDB.insertData(
                        id_txt.getText().toString().trim(),
                        name_txt.getText().toString().trim(),
                        marks_text.getText().toString().trim());
                if(inserted==true){
                    Toast.makeText(MainActivity.this, "Data has inserted", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Data has not inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //Click to view data
        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cur= myDB.getAllData();
                if(cur.getCount()==0){
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while (cur.moveToNext()){
                    buffer.append("Id"+cur.getString(0)+"\n");
                    buffer.append("name"+cur.getString(1)+"\n");
                    buffer.append("marks"+cur.getString(2)+"\n");
                }
                show("Data",buffer.toString());

            }
        });
        //Click to edit data
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Click to delete data
        delete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
public void show(String title, String Message){
    AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setTitle(title);
    builder.setMessage(Message);
    builder.setCancelable(true);
    builder.show();
}