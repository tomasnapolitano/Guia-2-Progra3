package com.company;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    public Libro(String titulo, double precio, int stock, Autor[] autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }

    public void sumarStock (int cant)
    {
        this.stock+=cant;
    }

    public String printMsg ()
    {
        StringBuilder nombres = new StringBuilder();

        for (Autor autor : autores)
        {
            if (autor != null)
            {
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
                nombres.append(" .");
            }
        }
        return ("El libro, " + titulo + " de " + nombres + " Se vende a " + precio + " pesos.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutor() {
        return autores;
    }

    public void setAutor(Autor[] autor) {
        this.autores = autor;
    }
}
