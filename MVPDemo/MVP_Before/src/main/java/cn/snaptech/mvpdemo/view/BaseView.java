package cn.snaptech.mvpdemo.view;

import cn.snaptech.mvpdemo.model.User;

public interface BaseView {
    public void showToast(String msg);
    public void loginSuccessful();
    public void loginFailed();
}
