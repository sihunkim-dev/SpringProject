package com.demotutorial.demo_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String testPage(Model model){
        model.addAttribute("title", "Demo Thymeleaf");
        return "index";
    }
}
