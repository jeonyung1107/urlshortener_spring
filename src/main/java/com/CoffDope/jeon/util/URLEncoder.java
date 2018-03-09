package com.CoffDope.jeon.util;

public class URLEncoder {
    final static private char[] BASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static String encodeURL(int id){
        String result = "";
        int mod = 62;

        do{
            int residual = id%mod;
            id = id/62;
            result = BASE[residual] + result;
        }while (id>0);

        return result;
    }
}
