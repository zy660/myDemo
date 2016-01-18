package com.test.mylib;

/**
 * AppUtil
 */
public class AppUtil {
    /**
     * isEmpty function
     * @param txt
     * @return
     */
    public static boolean isEmpty1(String txt){
        if (txt == null || txt.length() == 0){
            return true;
        }
        return false;
    }
}
