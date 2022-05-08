package com.company;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Diario> diarios;
    private ArrayList<Revista> revistas;


    public Biblioteca(ArrayList<Libro> libros, ArrayList<Diario> diarios, ArrayList<Revista> revistas) {
        this.libros = libros;
        this.diarios = diarios;
        this.revistas = revistas;
    }

//--------------------------------------------------------------
    public void printDisponibles()
    {
        System.out.println("---- Lista de Libros Disponibles:");
        for (Libro libro : libros)
        {
            if (libro!=null && libro.isDisponible()) {
                System.out.println(libro.toString());
            }
        }
        System.out.println("---- Lista de Revistas Disponibles:");
        for (Revista revista : revistas)
        {
            if (revista!=null && revista.isDisponible()) {
                System.out.println(revista.toString());
            }
        }
        System.out.println("---- Lista de Diarios Disponibles:");
        for (Diario diario : diarios)
        {
            if (diario!=null && diario.isDisponible()) {
                System.out.println(diario.toString());
            }
        }
    }

    public void printNoDisponibles()
    {
        System.out.println("---- Lista de Libros NO Disponibles:");
        for (Libro libro : libros)
        {
            if (libro!=null && !libro.isDisponible()) {
                System.out.println(libro.toString());
            }
        }
        System.out.println("---- Lista de Revistas NO Disponibles:");
        for (Revista revista : revistas)
        {
            if (revista!=null && !revista.isDisponible()) {
                System.out.println(revista.toString());
            }
        }
        System.out.println("---- Lista de Diarios NO Disponibles:");
        for (Diario diario : diarios)
        {
            if (diario!=null && !diario.isDisponible()) {
                System.out.println(diario.toString());
            }
        }
    }



//--------------------------------------------------------------





    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Diario> getDiarios() {
        return diarios;
    }

    public void setDiarios(ArrayList<Diario> diarios) {
        this.diarios = diarios;
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }
}
