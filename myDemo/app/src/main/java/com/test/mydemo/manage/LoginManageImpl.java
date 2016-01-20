package com.test.mydemo.manage;


public class LoginManageImpl implements ILogin{

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
