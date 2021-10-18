package com.ice.repositorioejercicios.WebView

class WebViewModel : WebViewContract.Model {
    override fun getUrl() : String{
        return "www.google.com.ar"
    }
}