package com.example.matchWise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {

        @GetMapping("/")
        public String getMainPage(Model model) {
            return "main";
        }

        @GetMapping("/sample")
        public String getMethodName(Model model) {
            return "sample";
        }
        
        
    
}
