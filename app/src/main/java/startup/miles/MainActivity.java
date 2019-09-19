package startup.miles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView)findViewById(R.id.webView);
        WebSettings webs=web.getSettings();
        webs.setJavaScriptEnabled(true);
        webs.setGeolocationEnabled(true);
        //web.loadUrl("https://www.bitconv.herokuapp.com");
        web.setWebViewClient(new WebViewClient());
//        web.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return false;
//            }
//        });
        web.loadUrl("https://www.google.com/maps");
    }
    @Override
    public void onBackPressed(){
        if(web.canGoBack()){
            web.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
}
