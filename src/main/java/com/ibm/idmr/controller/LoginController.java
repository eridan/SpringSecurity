package com.ibm.idmr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    
    @RequestMapping({"/","/index"})
    public String showIndex() {
        System.out.println("In the Controller. Index");
        return "index";
    }
    
    @RequestMapping("/login")
    public String showLogin() {
        System.out.println("In the Controller. Login");
        return "login";
    }
}
