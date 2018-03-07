package com.CoffDope.jeon.Controller;

import com.CoffDope.jeon.model.URLModel;
import com.CoffDope.jeon.service.URLServiceImpl;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class Main {
    @Autowired
    URLServiceImpl urlService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("hello!!");
        model.addAttribute("alarm", "plz insert URL");
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String showURL(URLModel uv){
        urlService.insertURL(uv);
        System.out.println("hey!!");
        return "index";
    }

    @RequestMapping("/short/{url}")
    public String redirectToShortened(Model model,@PathVariable String url){
        System.out.println(url);

        return "redirect:http://www.naver.com";
    }
}
