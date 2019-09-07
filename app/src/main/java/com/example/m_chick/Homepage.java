package com.example.m_chick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.m_chick.R;
public class Homepage extends AppCompatActivity {
private CardView diseaseCard,vaccinationCard,brooderCard,reminderCard,mapCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        diseaseCard=(CardView)findViewById(R.id.diseasecard);
        vaccinationCard=(CardView)findViewById(R.id.vaccinationcard);
        brooderCard=(CardView)findViewById(R.id.broodercard);
        reminderCard=(CardView)findViewById(R.id.remindercard);
        mapCard=(CardView)findViewById(R.id.mapcard);

        diseaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,InitialCheck.class);
                startActivity(intent);
            }
        });
    }
}
