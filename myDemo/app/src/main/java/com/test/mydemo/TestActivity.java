package com.test.mydemo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.test.mydemo.manage.ILogin;
import com.test.mydemo.manage.LoginManageImpl;
import com.test.mydemo.manage.OnLoginListener;
import com.test.mydemo.view.ILoginView;

public class TestActivity extends Activity implements ILoginView{
    private Button btnClick;
    private EditText etUserName;
    private EditText etPassword;
    private ILogin iLoginManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iLoginManager = new LoginManageImpl(this);
        setContentView(R.layout.activity_main);
        etUserName = (EditText)findViewById(R.id.et_username);
        etPassword = (EditText)findViewById(R.id.et_password);
        btnClick = (Button) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }


    @Override
    public String getUserName() {
        return etUserName.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void login() {
        iLoginManager.onLogin(getUserName(), getPassword(), new onLoginClickListener());
    }

    @Override
    public void showWaitTxt() {
        etUserName.setText("please waiting data...");
    }

    @Override
    public void removeWaitTxt() {
        etUserName.setText("");
        etPassword.setText("");
    }

    class onLoginClickListener implements OnLoginListener{

        @Override
        public void onLoginSuccess() {

        }

        @Override
        public void onLoginFail() {

        }

        @Override
        public void onLoginBefore() {

        }
    }
}
