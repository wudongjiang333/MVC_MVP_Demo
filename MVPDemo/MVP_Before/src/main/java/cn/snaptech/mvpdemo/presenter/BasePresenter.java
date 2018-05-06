package cn.snaptech.mvpdemo.presenter;

import cn.snaptech.mvpdemo.model.User;
import cn.snaptech.mvpdemo.view.BaseView;

public interface BasePresenter {
    public void attachView(BaseView view);
    public void detachView();
    public void login(User user);
}
