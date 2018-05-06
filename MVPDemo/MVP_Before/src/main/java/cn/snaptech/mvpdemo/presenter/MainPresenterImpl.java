package cn.snaptech.mvpdemo.presenter;

import android.text.TextUtils;

import cn.snaptech.mvpdemo.model.User;
import cn.snaptech.mvpdemo.view.BaseView;

public class MainPresenterImpl implements BasePresenter {
    private BaseView mView;
    @Override
    public void attachView(BaseView view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    @Override
    public void login(final User user) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(user.getName()) || TextUtils.isEmpty(user.getPassword())) {
                    mView.showToast("用户名或密码不能为空");
                } else {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if ("abc".equals(user.getName()) && "123".equals(user.getPassword())) {
                        mView.loginSuccessful();
                    } else {
                        mView.loginFailed();
                    }
                }
            }
        }).start();
    }
}
