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
        webviewSearch.loadUrl("https://www.google.com/search?rlz=1C1RLNS_enKE857KE857&sxsrf=ACYBGNTNaxtNL7oRQU_o77_pZkEfHTaAfQ:1568022352937&q=chick+feed+stores+in+kenya&npsic=0&rflfq=1&rlha=0&rllag=-1172146,36961159,19362&tbm=lcl&ved=2ahUKEwi-0eK6usPkAhUN6OAKHRbYAoAQjGp6BAgKEEg&tbs=lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:10&rldoc=1#rlfi=hd:;si:;mv:!1m2!1d-0.2298288!2d37.159859999999995!2m2!1d-1.3566722!2d35.997397500000005;tbs:lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:10");

    }
}
