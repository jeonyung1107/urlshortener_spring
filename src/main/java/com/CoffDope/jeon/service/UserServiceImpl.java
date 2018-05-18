package com.CoffDope.jeon.service;

import com.CoffDope.jeon.DAO.UserDAO;
import com.CoffDope.jeon.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    public void addUser(UserModel userModel) {
        userDAO.addUser(userModel);
    }

    public void deleteUser(UserModel userModel) {
        userDAO.deleteUser(userModel);
    }
}
