package rouder.demo.zzq.cn.eeepay.com.arouterdemo.service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 描述：声明接口,其他组件通过接口来调用服务
 * 作者：zhuangzeqin
 * 时间: 2018/4/27-15:48
 * 邮箱：zzq@eeepay.cn
 */
public interface HelloService extends IProvider {
    String sayHello(String name);
}
