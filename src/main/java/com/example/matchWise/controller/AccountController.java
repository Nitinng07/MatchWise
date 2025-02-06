package com.example.matchWise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.matchWise.model.Account;
import com.example.matchWise.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class AccountController {
    @Autowired
    private AccountService accountService ;

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }
    

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("account", new Account()) ;
        return "register";
    }
    
    
    @PostMapping("/register")
    public String register_user(@ModelAttribute Account account) {
        accountService.save(account) ;
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("account", new Account()) ;
        return "login";
    }

    @PostMapping("/login")
    public String postMethodName(@ModelAttribute Account account, Model model ) {
        Account existingAccount = accountService.findByEmail(account.getEmail()) ;

        if(existingAccount !=null && existingAccount.getPassword().equals(account.getPassword())){
                model.addAttribute("account", existingAccount) ;
                return "redirect:/home"; 
        }
        
        return "login";
    }
    
    @PostMapping("/logout")
    public String logout(Model model) {
        return "redirect:/";
    }
    
    
    
    
    
}
