package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "Hola desde Spring Boot");
        model.addAttribute("nombres", List.of("Ana", "Luis", "Pedro","Domingo"));  
        model.addAttribute("edad", 17 );
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        return "contacto";
    }
    @GetMapping("/asir")
    public String asir(Model model) {
        return "asir";
    }
    @GetMapping("/daw")
    public String daw(Model model) {
        return "daw";
    }
    @GetMapping("/smr")
    public String smr(Model model) {
        return "smr";
    }
}