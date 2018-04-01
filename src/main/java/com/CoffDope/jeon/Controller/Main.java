package com.CoffDope.jeon.Controller;

import com.CoffDope.jeon.model.URLModel;
import com.CoffDope.jeon.service.URLServiceImpl;
import com.CoffDope.jeon.util.URLDecoder;
import com.CoffDope.jeon.util.URLEncoder;
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

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("alarm", "plz insert URL");
        return "WEB-INF/views/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String showURL(Model model,URLModel uv){
        urlService.checkAndInsert(uv);
        URLModel result = urlService.getURL(uv);
        if(null!=result){
            String encoded = URLEncoder.encodeURL(result.getId());
            String url = "localhost:8080/short/" + encoded;
            model.addAttribute("alarm",url);
        }
        return "WEB-INF/views/index";
    }

    @RequestMapping("/short/{url}")
    public String redirectToShortened(Model model,@PathVariable String url){
        URLModel result = new URLModel();
        int id = URLDecoder.decodeURL(url);
        result.setId(id);

        URLModel res = urlService.getURLbyID(result);
        url = "redirect:https://" + res.getUrlLong();

        return url;
    }
}
