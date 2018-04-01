package com.CoffDope.jeon.Controller;

import com.CoffDope.jeon.model.UserModel;
import com.CoffDope.jeon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(method = RequestMethod.POST)
    public String login(UserModel userModel){

        return null;
    }
}
