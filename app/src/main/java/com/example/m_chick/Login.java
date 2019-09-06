package com.example.m_chick;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.m_chick.R;
public class Login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button login;
    TextView reg;
    Cursor cursor;
    EditText usrname, passcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
        reg=(TextView) findViewById(R.id.txtreg);
        usrname = (EditText) findViewById(R.id.username);
        passcode = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.signin);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usrname.getText().toString();
                String password = passcode.getText().toString();

                cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_7 + "=?  AND " + DatabaseHelper.COL_8 + "=?", new String[]{username,password});
                if (cursor!=null)
                {
                    if (cursor.getCount()>0) {
                        cursor.moveToNext();
                        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,InitialCheck.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Error! Please verify username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}
