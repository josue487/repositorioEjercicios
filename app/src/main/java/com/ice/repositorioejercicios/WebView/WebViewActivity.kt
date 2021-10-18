package com.ice.repositorioejercicios.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.ice.repositorioejercicios.R

class WebViewActivity : AppCompatActivity() , WebViewContract.View {
    private val webViewPresenter = WebViewPresenter(this,WebViewModel())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webViewPresenter.consultarUrl()
    }

    override fun establecerUrlEnWebView(url : String){
        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl(url)
    }

}