package cn.snaptech.mvp_after.presenter;

public interface BasePresenter<T> {
    void attachView(T v);
    void detachView();
}
