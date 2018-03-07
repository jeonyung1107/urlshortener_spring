package com.CoffDope.jeon.service;

import com.CoffDope.jeon.DAO.URLDAO;
import com.CoffDope.jeon.model.URLModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("urlservice")
public class URLServiceImpl implements URLService{
    @Autowired
    URLDAO urldao;

    public void insertURL(URLModel urlModel) {
        urldao.insertURL(urlModel);
    }

    public URLModel getURL(URLModel urlModel) {
        return urldao.getURL(urlModel);
    }
}
