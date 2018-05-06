package cn.snaptech.mvp_after.view;

/**
 * 只负责MainActivty中的UI逻辑
 */
public interface MainBaseView extends BaseView {
    void loginSuccessful();
    void loginFailed();
}
