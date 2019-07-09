package com.example.creatingwebform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage() {
        return "index";
    }
@RequestMapping ("/catalog")
    public String catalogPage(){
        return "Catalog";
    }
@RequestMapping ("/pricing")
    public String pricePage(){
        return "Pricing";
    }
}
