package com.actividad1.kevin.spring_actividad1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MateriasController {
    
    public record Materia(int id, String nombre, int creditos) {}

    @GetMapping("/materias")
    public List<Materia> getMaterias() {
        return List.of(
            new Materia(1, "Programacion Web", 8),
            new Materia(2, "Bases de Datos", 8),
            new Materia(3, "Redes", 6)
        );
    }
}
