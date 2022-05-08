package com.company;

public abstract class deCuerda extends Instrumento{

    private int cuerdas;

    public deCuerda(double precio, String marca, int cuerdas) {
        super(precio, marca);
        this.cuerdas = cuerdas;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }
}
