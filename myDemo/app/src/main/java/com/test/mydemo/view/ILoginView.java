package com.test.mydemo.view;

/**
 * ILoginView interface
 */
public interface ILoginView {
    public String getUserName();
    public String getPassword();
    public void login();

    void showWaitTxt();
    void removeWaitTxt();
}
