package com.company.ejercicio3;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    
    
    public Rectangulo()
    {
        super();
        this.altura = 2.0;
        this.base = 1.0;
    }

    public Rectangulo(double altura, double base)
    {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(String color,double base,double altura)
    {
        super(color);
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double calcularArea()
    {
        return base*altura;
    }

    @Override
    public double calcularPerimetro()
    {
        return 2*(base+altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "subclase de " +
                super.toString() +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
