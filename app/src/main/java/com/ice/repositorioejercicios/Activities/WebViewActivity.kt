package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.ice.repositorioejercicios.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://developer.android.com/guide/webapps/webview?hl=es-419")
    }
}