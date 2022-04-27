package com.company.ejercicio1;

public class Circulo {

    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        this.radio = 1.0;
        this.color = "Rojo";
    }

    public double calcularArea ()
    {
        return Math.PI*(Math.pow(radio,2));
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}

