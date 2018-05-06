package cn.snaptech.mvp_after.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.snaptech.mvp_after.R;
import cn.snaptech.mvp_after.model.User;
import cn.snaptech.mvp_after.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainBaseView{

    private MainPresenterImpl mMainPresenter;
    private EditText mEt_userName;
    private EditText mEt_psw;
    private Button mBtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        mEt_userName = findViewById(R.id.et_username);
        mEt_psw = findViewById(R.id.et_psw);
        mBtn_login = findViewById(R.id.btn_login);
    }

    private void initData(){
        mMainPresenter = new MainPresenterImpl();
        mMainPresenter.attachView(this);

        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(mEt_userName.getText().toString(), mEt_psw.getText().toString());
                mMainPresenter.login(user);
            }
        });
    }

    @Override
    public void showToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void loginSuccessful() {
        showToast("登陆成功");
    }

    @Override
    public void loginFailed() {
        showToast("登录失败");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }
}
