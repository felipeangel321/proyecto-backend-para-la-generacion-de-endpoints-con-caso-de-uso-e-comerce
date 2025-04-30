package com.felipeangel.blablapirest.restapi.model;

public class ProductoCategoria {
    private String categoria;
    private Double precioMin;
    private Double PrecioMax;

    public ProductoCategoria(Double PrecioMax, String categoria, Double precioMin) {
        this.PrecioMax = PrecioMax;
        this.categoria = categoria;
        this.precioMin = precioMin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecioMin() {
        return precioMin;
    }

    public void setPrecioMin(Double precioMin) {
        this.precioMin = precioMin;
    }

    public Double getPrecioMax() {
        return PrecioMax;
    }

    public void setPrecioMax(Double PrecioMax) {
        this.PrecioMax = PrecioMax;
    }
    



    
}
