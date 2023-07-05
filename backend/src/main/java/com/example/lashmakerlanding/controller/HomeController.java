package com.example.lashmakerlanding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
    @GetMapping("/home")
    public String showHomePage() {// Главная страница
        return "Главная страница";
    }

    @GetMapping("/about")
    public String showAboutMePage() {// Обо мне
        return "Обо мне";
    }

    @GetMapping("/portfolio")
    public String showPortfolioPage() {  // Портфолио
        return "Портфолио";
    }

    @GetMapping("/review")
    public String showReviewPage() {  // Отзывы
        return "Отзывы";
    }

    @GetMapping("/service")
    public String showServicePage() { // Услуги
        return "Услуги";
    }

    @GetMapping("/user")
    public String showUserPage() { // Личный кабинет
        return "Личный кабинет";
    }
}
