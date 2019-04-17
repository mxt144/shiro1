package com.mxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("UserController")
public class UserController {

    @RequestMapping("safeQuest")
    public String safeQuest(HttpSession session){
        session.invalidate();
        return "login";
    }

}
