package com.company;

public class Revista extends Ejemplar implements Alquilable{

    private String titular;


    public Revista(int codigo, int anio, String titular) {
        super(codigo, anio);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void alquilar() {
        if (super.isDisponible())
        {
            System.out.println("La revista '" + titular + "' se alquilo correctamente.");
            super.setDisponible(false);
        }
        else
            System.out.println("La revista '" + titular + "' ya se encuentra alquilada, por favor elegir otra.");

    }

    @Override
    public void devolver() {

        if (super.isDisponible())
            System.out.println("La revista '" + titular + "' ya ha sido devuelta antes.");
        else
        {
            System.out.println("La revista '" + titular + "' se ha devuelto correctamente.");
            super.setDisponible(true);
        }

    }

    @Override
    public void alquilado() {
        // qué haría este metodo????
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titular='" + titular + '\'' +
                '}';
    }
}
