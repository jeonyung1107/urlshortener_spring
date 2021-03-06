package com.CoffDope.jeon.service;

import com.CoffDope.jeon.DAO.UserDAO;
import com.CoffDope.jeon.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginservice")
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserDAO userDAO;

    public boolean login(UserModel userModel){
        UserModel result = userDAO.getUser(userModel);
        if(null != result){
            return true;
        }
        return false;
    }
}
