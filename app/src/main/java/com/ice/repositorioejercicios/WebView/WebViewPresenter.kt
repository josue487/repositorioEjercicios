package com.ice.repositorioejercicios.WebView

class WebViewPresenter(private val webViewView : WebViewContract.View, private  val wevViewModel : WebViewContract.Model ) : WebViewContract.Presenter {
    override fun consultarUrl() {
        webViewView.establecerUrlEnWebView(wevViewModel.getUrl())
    }

}