package com.company.ejercicio3;

public class Circulo extends Figura{

    private double radio;

    public Circulo()
    {
        super();
        this.radio = 1.0;
    }

    public Circulo(String color,double radio)
    {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro ()
    {
        return 2*Math.PI*radio;
    }

    @Override
    public double calcularArea()
    {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "subclase de " +
                super.toString() +
                "radio=" + radio +
                '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
