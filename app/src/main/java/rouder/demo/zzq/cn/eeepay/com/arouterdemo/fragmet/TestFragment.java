package rouder.demo.zzq.cn.eeepay.com.arouterdemo.fragmet;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 描述：测试Fragment
 * 作者：zhuangzeqin
 * 时间: 2018/4/27-16:21
 * 邮箱：zzq@eeepay.cn
 */
@Route(path = "/test/fragment")
public class TestFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
