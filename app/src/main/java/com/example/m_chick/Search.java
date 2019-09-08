package com.example.m_chick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Search extends AppCompatActivity {
WebView webviewSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        webviewSearch=(WebView)findViewById(R.id.websearch);
        webviewSearch.setWebViewClient(new WebViewClient());
        webviewSearch.loadUrl("https://www.google.com/maps/search/poultry+store/@-1.2882562,36.8290888,17.25z");

    }
}
