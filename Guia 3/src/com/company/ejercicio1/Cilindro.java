package com.company.ejercicio1;

public class Cilindro extends Circulo{

    private double altura;

    public Cilindro()
    {
        super();
        altura = 1.0;
    }

    public Cilindro(double radio, String color)
    {
        super (radio, color);
        altura = 1.0;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen ()
    {
        //Math.PI*(Math.pow(getRadio(),2))*altura
        return super.calcularArea()*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "subclase de " +
                super.toString() +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularArea ()
    {
        return (Math.PI*2*super.getRadio()*altura + 2*super.calcularArea());
    }
}
