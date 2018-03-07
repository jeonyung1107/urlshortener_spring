package com.CoffDope.jeon.util;

public class URLDecoder {
    final static private char[] BASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    public static int decodeURL(String url){
        String base = new String(BASE);
        int result = 0;
        for(int i=0;i<url.length();++i){
            result = result*62 + base.indexOf(url.charAt(i));
        }

        return result;
    }
}
