package com.CoffDope.jeon.service;

import com.CoffDope.jeon.model.UserModel;

public interface UserService {
    void addUser(UserModel userModel);
    void deleteUser(UserModel userModel);
}
