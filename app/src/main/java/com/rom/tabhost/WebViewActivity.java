package com.rom.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {
    EditText editURL;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        editURL = findViewById(R.id.edit_url);
        Button btnMove = findViewById(R.id.btn_move);
        Button btnBack = findViewById(R.id.btn_back);
        web = findViewById(R.id.webview);
        web.setWebViewClient(new MyWebViewClient());

        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);
        btnMove.setOnClickListener(btnListener);
        btnBack.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_move:
                    web.loadUrl(editURL.getText().toString());
                    break;
                case R.id.btn_back:
                    web.goBack();
                    break;
            }
        }
    };

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}