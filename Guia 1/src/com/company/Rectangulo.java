package com.company;

public class Rectangulo {

    private double  ancho = 1.0;
    private double alto = 1.0;

    // GETTERS Y SETTERS ------------------------------------------------
    public void setAncho(double a)
    {
        this.ancho=a;
    }

    public void setAlto(double a)
    {
        this.alto= a;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho()
    {
        return ancho;
    }
    // GETTERS Y SETTERS ------------------------------------------------


    public double areaRectangulo()
    {
        return (alto*ancho);
    }

    public double perimetroRectangulo ()
    {
        return ((ancho*2)+(alto*2));
    }


}
