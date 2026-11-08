package com.actividad1.kevin.spring_actividad1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class InfoController {
    
    @GetMapping("/nombre")
    public String getNombre(){
        return "Actividad 1 - Nava Peralta Kevin Peralta";
    }

    @GetMapping("/numero")
    public int getNumero() {
        return 42;
    }
    
}
