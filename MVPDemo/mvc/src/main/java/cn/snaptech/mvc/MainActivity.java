package cn.snaptech.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    private void initData() {
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mEt_userName.getText().toString();
                String psw = mEt_psw.getText().toString();
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(psw)) {
                    showToast("用户名和密码不能为空");
                } else {
                    login(username,psw);
                }
            }
        });
    }

    private void login(final String username, final String psw) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ("abc".equals(username) && "123".equals(psw)) {
                    showToast("登陆成功");
                } else {
                    showToast("登录失败");
                }
            }
        }).start();
    }

    private void showToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
