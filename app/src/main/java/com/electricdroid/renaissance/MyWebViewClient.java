package com.electricdroid.renaissance;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by anki on 03-02-2015.
 */
public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
