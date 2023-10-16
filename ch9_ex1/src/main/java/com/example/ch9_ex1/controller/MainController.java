package com.example.ch9_ex1.controller;
import com.example.ch9_ex1.services.LoginCountService;

import com.example.ch9_ex1.services.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.DoubleSummaryStatistics;

@Controller
public class MainController {
    private final LoginCountService loginCountService;
    private final LoggedUserManagementService loggedUserManagementService;
    public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String Logout, Model model ) {
        if (Logout != null) {
            loggedUserManagementService.setUsername(null);
        }
        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();
        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username" , username);
        model.addAttribute("loginCount", count);
        return "main.html";
    }
}
