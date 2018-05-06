package cn.snaptech.mvp_after.presenter;

import android.text.TextUtils;

import cn.snaptech.mvp_after.model.User;
import cn.snaptech.mvp_after.view.BaseView;
import cn.snaptech.mvp_after.view.MainBaseView;

/**
 * MainActivity业务逻辑的具体实现
 */
public class MainPresenterImpl implements MainBasePresenter {
    private MainBaseView mMainBaseView;

    @Override
    public void login(final User user) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(user.getName()) || TextUtils.isEmpty(user.getPassword())) {
                    mMainBaseView.showToast("用户名或密码不能为空");
                } else {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if ("abc".equals(user.getName()) && "123".equals(user.getPassword())) {
                        mMainBaseView.loginSuccessful();
                    } else {
                        mMainBaseView.loginFailed();
                    }
                }
            }
        }).start();
    }

    @Override
    public void attachView(MainBaseView v) {
        this.mMainBaseView = v;
    }

    @Override
    public void detachView() {
        this.mMainBaseView = null;
    }
}
