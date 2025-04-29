package com.felipeangel.blablapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeangel.blablapirest.restapi.model.Boleta;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(){
        return "Se listan todos los productos";

    }
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable long id){
        return "se esta mostrando el producto por el id  " +id;
        

    }
    @GetMapping("/Boleta/{id}")
    public Boleta getBoleta(@PathVariable long id){
        return new Boleta(getProducts(), getProducts(), null, id, getProducts());
    }

    
}
