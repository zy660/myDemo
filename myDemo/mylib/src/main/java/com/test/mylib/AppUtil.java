package com.test.mylib;


public class AppUtil {

    public static boolean isEmpty(String txt){
        if (txt == null || txt.length() == 0){
            return true;
        }
        return false;
    }
}
