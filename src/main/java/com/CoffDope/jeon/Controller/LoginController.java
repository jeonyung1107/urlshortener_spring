package com.CoffDope.jeon.Controller;

import com.CoffDope.jeon.model.UserModel;
import com.CoffDope.jeon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public String toLoginPage(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(UserModel userModel, HttpSession session){
        if(true == loginService.login(userModel)){
            session.setAttribute("login",userModel.getId());
        }

        return "index";
    }
}
