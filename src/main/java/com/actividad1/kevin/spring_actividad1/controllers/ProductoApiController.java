package com.actividad1.kevin.spring_actividad1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad1.kevin.spring_actividad1.dto.ProductoDTO;
import com.actividad1.kevin.spring_actividad1.services.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoApiController {
    private final ProductoService service;

    public ProductoApiController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProductoDTO> crear(@RequestBody ProductoDTO dto) {
        return ResponseEntity.status(201).body(service.agregar(dto));
    }
}
