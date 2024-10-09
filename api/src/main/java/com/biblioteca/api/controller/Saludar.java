package com.biblioteca.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Saludar {
    
    @GetMapping("/saludar")
    public String saludar() {
        return "Hola mundo";
    }    
}
