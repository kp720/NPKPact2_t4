package com.actividad1.kevin.spring_actividad1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.actividad1.kevin.spring_actividad1.dto.ProductoDTO;
import com.actividad1.kevin.spring_actividad1.services.ProductoService;


@Controller
@RequestMapping("/productos")
public class ProductoViewController {
    
    private final ProductoService service;

    @Value("${app.autor}")
    private String autor;

    @Value("${app.proyecto}")
    private String proyecto;

    public ProductoViewController(ProductoService service) {
        this.service = service;
    }

    // Lista + filtro con @RequestParam: /productos?categoria=Papelería
    @GetMapping
    public String lista(@RequestParam(required = false) String categoria, Model model) {
        model.addAttribute("productos", service.listar(categoria));
        model.addAttribute("categoria", categoria);
        model.addAttribute("autor", autor);
        model.addAttribute("proyecto", proyecto);
        return "lista";
    }

    // Formulario (GET)
    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("producto", new ProductoDTO());
        return "formulario";
    }

    // Recibe el formulario con @ModelAttribute (POST)
    @PostMapping("/nuevo")
    public String guardar(@ModelAttribute("producto") ProductoDTO producto) {
        service.agregar(producto);
        return "redirect:/productos";
    }

    // Detalle con @PathVariable: /productos/2
    @GetMapping("/{id}")
    public String detalle(@PathVariable int id, Model model) {
        model.addAttribute("producto", service.buscar(id).orElse(null));
        return "detalle";
    }

}


