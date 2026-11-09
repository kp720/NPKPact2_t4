package com.actividad1.kevin.spring_actividad1.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad1.kevin.spring_actividad1.dto.ClaseDTO;
import com.actividad1.kevin.spring_actividad1.models.Empleados;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping ("/api")

public class EjemploRestController {
    


    @GetMapping(path = "/detalles_info2")

    
    /* 
    @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    */
    public ClaseDTO detallest_info2(){
        /*
        Empleados empleado1 = new Empleados("Pedro", "Pacheco", "Calle 502", "cajero", 35, 1236579080, 001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado","Datos empleados");
        respuesta.put("Información",empleado1);        

        return usuario1;
        */

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("InformationCondig");

        return usuario1;
    }
    
}
