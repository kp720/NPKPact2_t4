package com.actividad1.kevin.spring_actividad1.services;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.actividad1.kevin.spring_actividad1.dto.ProductoDTO;

@Service 
public class ProductoService {
    private final List<ProductoDTO> productos = new ArrayList<>();
    private final AtomicInteger contador = new AtomicInteger(0);

    public ProductoService() {
        agregar(new ProductoDTO(null, "Laptop", 15999.0, "Electrónica"));
        agregar(new ProductoDTO(null, "Mouse", 299.0, "Electrónica"));
        agregar(new ProductoDTO(null, "Cuaderno", 45.0, "Papelería"));
        agregar(new ProductoDTO(null, "Pluma", 12.5, "Papelería"));
    }

    public List<ProductoDTO> listar(String categoria) {
        if (categoria == null || categoria.isBlank()) return productos;
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .toList();
    }

    public Optional<ProductoDTO> buscar(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public ProductoDTO agregar(ProductoDTO p) {
        p.setId(contador.incrementAndGet());
        productos.add(p);
        return p;
    }
}
