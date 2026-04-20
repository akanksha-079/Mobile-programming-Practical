package com.hamida.myapplication;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WebView_Activity extends AppCompatActivity {

    EditText edtURL;
    Button btnOpen;

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        edtURL=findViewById(R.id.edtURL);
        btnOpen=findViewById(R.id.btnOpen);
        webview=findViewById(R.id.webview);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;

                url="https://www."+ edtURL.getText().toString().trim();

                WebSettings webset = webview.getSettings();
                webset.setJavaScriptEnabled(true);
                webview.setWebViewClient(new WebViewClient());
                webview.loadUrl(url);

            }
        });

    }
}