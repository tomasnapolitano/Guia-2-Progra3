package com.company;

public class Diario extends Ejemplar{

    private String titular;


    public Diario(int codigo, int anio, String titular)
    {
        super(codigo,anio);
        this.titular=titular;
    }


    public void leerDiario()
    {
        if (super.isDisponible())
        {
            System.out.println("Se comenzo a leer el diario '" + "' correctamente.");
            super.setDisponible(false);
        }
        System.out.println("El diario '" + "' ya esta siendo leido.");
    }

    @Override
    public String toString() {
        return "Diario{" +
                "titular='" + titular + '\'' +
                '}';
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


}
