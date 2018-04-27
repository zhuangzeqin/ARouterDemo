package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
 /**
  * 描述：SchemeFilter 过滤跳转
  * 作者：zhuangzeqin
  * 时间: 2018/4/27-14:59
  * 邮箱：zzq@eeepay.cn
  */
 @Route(path = "/test/SchemeFilterAct")
public class SchemeFilterAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //直接通过ARouter处理外部Uri
        Uri uri = getIntent().getData();
        ARouter.getInstance().build(uri).navigation(this, new NavCallback() {
            @Override
            public void onArrival(Postcard postcard) {
                finish();
            }
        });
    }
}
