package com.company;

public abstract class Ejemplar {

    private int codigo;
    private int anio;
    private boolean disponible;

    protected Ejemplar(int codigo, int anio) {
        this.codigo = codigo;
        this.anio = anio;
        this.disponible=true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
