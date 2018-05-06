package cn.snaptech.mvp_after.presenter;

import cn.snaptech.mvp_after.view.OtherBaseView;

/**
 * 只为OtherActivity提供业务逻辑
 */
public interface OtherBasePresenter extends BasePresenter<OtherBaseView> {
    void uploadImage(String path) ;
}
