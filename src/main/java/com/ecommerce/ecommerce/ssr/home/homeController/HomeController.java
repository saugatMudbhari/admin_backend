package com.ecommerce.ecommerce.ssr.home.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboardPage")
public class HomeController {

    @GetMapping("")
    public String getHome(Model model){
        model.addAttribute("pageTitle", "Dashboard");
        return "home";
    }
}
