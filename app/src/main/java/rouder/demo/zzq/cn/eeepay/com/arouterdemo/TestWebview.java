package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 描述：简单的一个wenbview 加载
 * 作者：zhuangzeqin
 * 时间: 2018/4/27-14:56
 * 邮箱：zzq@eeepay.cn
 */
@Route(path = "/test/webview")
public class TestWebview extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_webview);
        this.webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl(getIntent().getStringExtra("url"));
    }
}
