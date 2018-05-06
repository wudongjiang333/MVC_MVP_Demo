package cn.snaptech.mvp_after.presenter;

import cn.snaptech.mvp_after.view.OtherBaseView;

/**
 * OtherActivity业务逻辑的具体实现
 */
public class OtherBasePresenterImpl implements OtherBasePresenter {
    private OtherBaseView mOtherBaseView;
    @Override
    public void uploadImage(String path) {

    }

    @Override
    public void attachView(OtherBaseView v) {
        this.mOtherBaseView = v;
    }

    @Override
    public void detachView() {
        this.mOtherBaseView = null;
    }
}
