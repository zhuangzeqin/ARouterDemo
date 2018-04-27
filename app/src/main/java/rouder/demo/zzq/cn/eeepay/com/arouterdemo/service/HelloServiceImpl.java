package rouder.demo.zzq.cn.eeepay.com.arouterdemo.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 描述：实现接口服务
 * 作者：zhuangzeqin
 * 时间: 2018/4/27-15:50
 * 邮箱：zzq@eeepay.cn
 */
@Route(path = "/service/hello", name = "sayHello")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }

    @Override
    public void init(Context context) {

    }
}
