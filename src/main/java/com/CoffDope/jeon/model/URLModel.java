package com.CoffDope.jeon.model;

import com.sun.istack.internal.Nullable;

public class URLModel {
    private int id;
    private String urlLong;
    private String urlShort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Nullable
    public String getUrlLong() {
        return urlLong;
    }

    public void setUrlLong(String urlLong) {
        this.urlLong = urlLong;
    }

    public String getUrlShort() {
        return urlShort;
    }

    public void setUrlShort(String urlShort) {
        this.urlShort = urlShort;
    }
}
