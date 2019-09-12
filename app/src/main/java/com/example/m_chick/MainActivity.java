package com.example.m_chick;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.m_chick.R;
public class MainActivity extends AppCompatActivity {
    Button SignIn, SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        SignIn = (Button) findViewById(R.id.signin);
        SignUp = (Button) findViewById(R.id.signup);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }

    public void register (View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
