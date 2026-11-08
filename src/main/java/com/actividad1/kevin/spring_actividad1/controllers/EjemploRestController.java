package com.actividad1.kevin.spring_actividad1.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController {
    
    @GetMapping("/detalles_info2")
    public Map<String, Object> detallest_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo","Servidor en linea");
        respuesta.put("Servidor","Informaticonfig");
        respuesta.put("Ip", "192.168.1.1");
        
        return respuesta;

    }

    
}
