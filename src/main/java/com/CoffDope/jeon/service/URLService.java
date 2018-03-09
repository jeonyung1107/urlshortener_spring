package com.CoffDope.jeon.service;

import com.CoffDope.jeon.model.URLModel;

public interface URLService {
    public void insertURL(URLModel urlModel);
    public URLModel getURL(URLModel urlModel);
    public void checkAndInsert(URLModel urlModel);
}
