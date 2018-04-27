package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
 /**
  * 描述：在ActivityB中获取参数有两种方式，一种是普通Activity那样getIntent().getXXX
        加一种是使用@Autowired注解的方式
  * 作者：zhuangzeqin
  * 时间: 2018/4/24-14:33
  * 邮箱：zzq@eeepay.cn
  */
@Route(path = "/app/M2")
public class M2Activity extends AppCompatActivity {
    @Autowired
    long key1;
    @Autowired (name = "key3")// 通过name来映射URL中的不同参数
    String name;
//    @Autowired
//    Test key4;// 支持解析自定义对象，URL中使用json传递


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);
        ARouter.getInstance().inject(this);
        // ARouter会自动对字段进行赋值，无需主动获取
        Log.d("param", name + key1);
    }
}
