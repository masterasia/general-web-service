package com.pns.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by robert.xu on 2016/4/25 0025.
 */

@Controller
public class ExampleController {

    @RequestMapping("/home")
    public String homePage(HttpServletRequest request, HttpServletResponse response){
        return "home.html";
    }
}
