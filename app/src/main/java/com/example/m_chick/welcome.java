package com.example.m_chick;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.m_chick.R;
import gr.net.maroulis.library.EasySplashScreen;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        EasySplashScreen welcome = new EasySplashScreen(welcome.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withLogo(R.drawable.chick1)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("Welcome to ChickMonitor!")
                .withAfterLogoText("Helping farmers Monitor their Chicks")
                .withFooterText("Copyright @ danny");

        welcome.getHeaderTextView().setTextColor(Color.BLUE);
        welcome.getHeaderTextView().setTextSize(15);
        welcome.getFooterTextView().setTextSize(15);
        welcome.getAfterLogoTextView().setTextSize(20);
        welcome.getFooterTextView().setTextColor(Color.DKGRAY);

        View view = welcome.create();
        setContentView(view);
    }
}
