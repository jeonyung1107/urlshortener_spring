package com.CoffDope.jeon.Controller;

import com.CoffDope.jeon.model.UserModel;
import com.CoffDope.jeon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add", method = GET)
    public String showUserAddView(){
        return "user/addUser";
    }

    @RequestMapping(value = "/add", method = POST)
    public String addUser(UserModel userModel){
        userService.addUser(userModel);

        return "/";
    }
}
