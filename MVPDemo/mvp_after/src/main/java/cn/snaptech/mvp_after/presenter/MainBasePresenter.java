package cn.snaptech.mvp_after.presenter;

import cn.snaptech.mvp_after.model.User;
import cn.snaptech.mvp_after.view.MainBaseView;

/**
 * 只为MainActivity提供业务逻辑
 */
public interface MainBasePresenter extends BasePresenter<MainBaseView>{
    void login(User user);
}
