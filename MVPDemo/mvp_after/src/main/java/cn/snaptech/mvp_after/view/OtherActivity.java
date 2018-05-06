package cn.snaptech.mvp_after.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.snaptech.mvp_after.R;

/**
 * 业务逻辑相关        请求图片或下载上传。。。<br/>
 * UI相关的业务逻辑    显示图片  显示进度条  弹TOAST。。。<br/>
 */
public class OtherActivity extends AppCompatActivity implements OtherBaseView{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    @Override
    public void showProgress(int progress) {

    }

    @Override
    public void showToast(String msg) {

    }
}
