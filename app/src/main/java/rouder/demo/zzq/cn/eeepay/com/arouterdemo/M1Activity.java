package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
 /**
  * 描述：测试1 用的一个普通的Actvity
  * 作者：zhuangzeqin
  * 时间: 2018/4/27-14:57
  * 邮箱：zzq@eeepay.cn
  */
@Route(path = "/app/M1")
public class M1Activity extends AppCompatActivity {

    private android.widget.TextView tvhelloM1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        this.tvhelloM1 = (TextView) findViewById(R.id.tv_helloM1);
        tvhelloM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(100);
                finish();
            }
        });
    }
}
