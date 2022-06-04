package com.unvise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstPageController {

    @GetMapping("/")
    public String firstPage() {
        return "index";
    }

}
