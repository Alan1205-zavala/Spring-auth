package com.example.auth.controller;

import com.example.auth.dto.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/inicio")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/inicio")
    public String processLogin(LoginRequest loginRequest, Model model) {
        if("admin".equals(loginRequest.getUsername()) && "1234".equals(loginRequest.getPassword())) {
            model.addAttribute("username", loginRequest.getUsername());
            return "home";
        } else {
            model.addAttribute("error", "Credenciales inválidas");
            return "login";
        }
    }
}