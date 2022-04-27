package com.company.ejercicio3;

public class Cuadrado extends Rectangulo{

    public Cuadrado()
    {
        super(1.0,1.0);
    }

    public Cuadrado (String color, double lado)
    {
        super (color,lado,lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "subclase de " +
                super.toString() +
                "color='" + color + '\'' +
                '}';
    }
}
