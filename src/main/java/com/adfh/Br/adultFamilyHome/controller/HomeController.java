package com.adfh.Br.adultFamilyHome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
     return "index";
   }
}
