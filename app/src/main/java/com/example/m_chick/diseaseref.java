package com.example.m_chick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import com.example.m_chick.R;
public class diseaseref extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseaseref);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("http://www.nafis.go.ke/livestock/poultry-chicken/general-information/poultry-diseases/");

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
