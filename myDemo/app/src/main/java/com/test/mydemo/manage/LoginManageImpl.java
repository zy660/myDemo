package com.test.mydemo.manage;


import com.test.mydemo.view.ILoginView;

public class LoginManageImpl implements ILogin{
    private ILoginView iLoginView;
    public LoginManageImpl(ILoginView iLoginView){
        this.iLoginView = iLoginView;
    }

    @Override
    public void onLogin(String username, String password, OnLoginListener loginListener) {
        loginListener.onLoginBefore();

        try {
            Thread.sleep(2000);
            loginListener.onLoginSuccess();
        } catch (InterruptedException e) {
            e.printStackTrace();
            loginListener.onLoginFail();
        }
    }
}
