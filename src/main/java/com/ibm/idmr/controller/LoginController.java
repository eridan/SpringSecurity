package com.ibm.idmr.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, Principal principal) {
        String name = principal.getName();
        model.addAttribute("username", name);
        model.addAttribute("message", "Spring Security Custom Form example");
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login(ModelMap model) {
        System.out.println("LoginController. Login method");
        return "login";
    }

    @RequestMapping(value = "/loginfailed")
    public String loginerror(ModelMap model) {
        System.out.println("Login controller. Login Failed");
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(ModelMap model) {
        System.out.println("LoginController. Log out.");
        return "login";
    }
    
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage () {
        return "index";
    }
}
