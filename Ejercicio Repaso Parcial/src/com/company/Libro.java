package com.company;

public class Libro extends Ejemplar implements Alquilable{

    private String titulo;
    private Genero genero;

    public Libro(int codigo, int anio, String titulo, Genero genero)
    {
        super(codigo,anio);
        this.titulo=titulo;
        this.genero=genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {
        if (super.isDisponible())
            System.out.println("El Libro '" + titulo + "' ya ha sido devuelto antes.");
        else
        {
            System.out.println("El Libro '" + titulo + "' se ha devuelto correctamente.");
            super.setDisponible(true);
        }
    }

    @Override
    public void alquilado() {
        //  que hace este metodo??
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                '}';
    }
}
