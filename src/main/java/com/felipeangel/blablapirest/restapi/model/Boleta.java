package com.felipeangel.blablapirest.restapi.model;

public class Boleta {
    private long numeroBoleta;
    private String logoBoleta;
    private String fechaBoleta;
    private Double montoTotal;
    private String productos;

    public Boleta(String fechaBoleta, String logoBoleta, Double montoTotal, long numeroBoleta, String productos) {
        this.fechaBoleta = fechaBoleta;
        this.logoBoleta = logoBoleta;
        this.montoTotal = montoTotal;
        this.numeroBoleta = numeroBoleta;
        this.productos = productos;
    }

    public long getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(long numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public String getLogoBoleta() {
        return logoBoleta;
    }

    public void setLogoBoleta(String logoBoleta) {
        this.logoBoleta = logoBoleta;
    }

    public String getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(String fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    
}
