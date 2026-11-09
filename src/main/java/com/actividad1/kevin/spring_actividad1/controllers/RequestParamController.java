package com.actividad1.kevin.spring_actividad1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/parametros") 
public class RequestParamController {
    
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hola") String informacion) {
        ParametroDTO param1 = new ParametroDTO();
        param1.setInformacion(informacion);

        return param1;
    }
    
}
