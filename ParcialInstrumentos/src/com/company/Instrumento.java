package com.company;

public abstract class Instrumento {

    private double precio;
    private String marca;

    public Instrumento(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }


    public abstract void actualizarPrecio();




    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
