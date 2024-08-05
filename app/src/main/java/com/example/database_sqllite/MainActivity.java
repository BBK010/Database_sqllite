package com.example.database_sqllite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText id_txt,name_txt,marks_text;

    Button insert_btn, view_btn, edit_btn, delete_btn;

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

        //Click to insert data
        insert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Click to edit data
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Click to view data
        view_btn.setOnClickListener(new View.OnClickListener() {
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