package ch7_ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.AttributedString;

@Controller
public class MainController {
    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color, Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color); return "home.html";
    }
}
