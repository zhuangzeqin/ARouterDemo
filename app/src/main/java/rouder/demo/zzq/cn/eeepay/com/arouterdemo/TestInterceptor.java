package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 描述：class describe
 * 作者：zhuangzeqin
 * 时间: 2018/4/24-16:52
 * 邮箱：zzq@eeepay.cn
 */
//其中priority为拦截器的优先级，值越小，优先级越高
@Interceptor(priority = 8, name = "测试用拦截器")
public class TestInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (postcard.getPath().equals("/app/M2"))
        {
            Log.d("tag","进行拦截处理");
            ARouter.getInstance().build("/app/M1").setTag(Intent.FLAG_ACTIVITY_CLEAR_TOP).greenChannel().navigation();
        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {

    }
}
