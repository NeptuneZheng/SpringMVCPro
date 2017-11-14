package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowWorldController{
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String showHello(ModelMap model){
        model.addAttribute("message","First MVC Test");
        return "hello";
    }

}
