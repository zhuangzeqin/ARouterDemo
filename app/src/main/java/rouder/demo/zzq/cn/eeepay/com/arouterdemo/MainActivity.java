package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import rouder.demo.zzq.cn.eeepay.com.arouterdemo.service.HelloService;


// 在支持路由的页面上添加注解(必选)
// 这里的路径需要注意的是至少需要有两级，/xx/xx
@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private android.widget.Button btn01;
    private android.widget.Button btn02;

    @Autowired
    HelloService helloService;

    @Autowired(name = "/service/hello")
    HelloService helloService2;
    private Button btn03;
    private Button btn04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ARouter.getInstance().inject(this);
        this.btn03 = (Button) findViewById(R.id.btn_03);
        this.btn02 = (Button) findViewById(R.id.btn_02);
        this.btn01 = (Button) findViewById(R.id.btn_01);
        this.btn04 = (Button) findViewById(R.id.btn_04);
        this.btn01.setOnClickListener(this);
        this.btn02.setOnClickListener(this);
        this.btn03.setOnClickListener(this);
        this.btn04.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                ARouter.getInstance().build("/app/M1").navigation();//1 简单的页面调整
//                ARouter.getInstance().build("/home/main", "ap").navigation(); // 2构建标准的路由请求，并指定分组
//                ARouter.getInstance().build("/app/M1").navigation(this,999);//3 类似startActivityForResult 只需要在navigation中传入两个参数，第一个就是Context，第二个参数是requestCode。
//                ARouter.getInstance().build("/app/M2").withLong("key1", 666L).withString("key3", "888").navigation(this,5);//4 带参数 ARouter提供了很多的withXX方法，可以携带基本类型,Object,Parcelable等等，里面的原理也是通过Bundle进行携带
                // 使用绿色通道(跳过所有的拦截器)
//                ARouter.getInstance().build("/home/main").greenChannel().navigation();
                break;
            case R.id.btn_02:
                ARouter.getInstance().build("/test/webview")
                        .withString("url", "file:///android_asset/schame-test.html")
                        .navigation();
                break;
            case R.id.btn_03:
                // 1. (推荐)使用依赖注入的方式发现服务,通过注解标注字段,即可使用，无需主动获取
                // Autowired注解中标注name之后，将会使用byName的方式注入对应的字段，不设置name属性，会默认使用byType的方式发现服务(当同一接口有多个实现的时候，必须使用byName的方式发现服务)
                String vergil1 = helloService.sayHello("Vergil1");
                String vergil2 = helloService2.sayHello("Vergil2");

                // 2. 使用依赖查找的方式发现服务，主动去发现服务并使用，下面两种方式分别是byName和byType
                HelloService helloService3 = ARouter.getInstance().navigation(HelloService.class);
                HelloService helloService4 = (HelloService) ARouter.getInstance().build("/service/hello").navigation();
                helloService3.sayHello("Vergil3");
                helloService4.sayHello("Vergil4");
                break;
            case R.id.btn_04:
                // 获取Fragment
                Fragment fragment = (Fragment) ARouter.getInstance().build("/test/fragment").navigation();
                break;
            default:

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 999:
                Toast.makeText(this, "get  resultCode:" + String.valueOf(resultCode), Toast.LENGTH_LONG).show();
            default:
                break;
        }

    }
}
