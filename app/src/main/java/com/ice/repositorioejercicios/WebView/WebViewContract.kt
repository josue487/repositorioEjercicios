package com.ice.repositorioejercicios.WebView

interface WebViewContract {
    interface View{
        fun establecerUrlEnWebView(url : String)
    }
    interface Presenter{
        fun consultarUrl()
    }
    interface Model{
        fun getUrl() : String
    }
}