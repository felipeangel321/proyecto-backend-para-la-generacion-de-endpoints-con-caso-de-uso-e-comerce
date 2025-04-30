package com.felipeangel.blablapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/ProductoCategoria")
    public String getProductoCategoria(
        @RequestParam(required= false) String categoria,
        @RequestParam(defaultValue = "0") int precioMin,
        @RequestParam(defaultValue = "10000") int precioMax
    ){
        return "productos filtrados por: "+
        "categoria="+(categoria !=null ? categoria : "todas" ) + 
        "\n,precio min ="+ precioMin +
        "\n,precio max = " + precioMax ;


    //@GetMapping("/productos")
//public String listarProductos(
//@RequestParam(required = false) String categoria,
//@RequestParam(defaultValue = "nombre") String ordenarPor,
//@RequestParam(defaultValue = "10") int limite) {
//return "Lista de productos filtrados por: " +
//"categoría=" + (categoria != null ? categoria : "todas") +
//", ordenados por=" + ordenarPor +
//", límite=" + limite


    }
}
