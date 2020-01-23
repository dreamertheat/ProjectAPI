package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import android.view.View
import android.view.animation.AccelerateInterpolator
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class CustomWVC(val url : String, val viewx : View)  : WebViewClient() {

    override fun onReceivedError(
        view: WebView?,
        request: WebResourceRequest?,
        error: WebResourceError?
    ) {
        super.onReceivedError(view, request, error)
    }

    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        view!!.loadUrl(url)
        return true
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        view!!.animate().alpha(1f).setDuration(2000)
            .setInterpolator(AccelerateInterpolator()).start()
        viewx!!.animate().alpha(0f).setDuration(2000)
            .setInterpolator(AccelerateInterpolator()).start()
        super.onPageFinished(view, url)
    }
}