package com.company;

import java.time.LocalDate;

public class Film {
    private String titulo;
    private LocalDate lanzamiento;
    private double duracion;
    private Clasificacion clasificacion;
    private String paisOrigen;
    private String descripcion;
    private int stock;
    private Genero genero;
    private int numAlquileres;

    public Film() {

    }

    public Film(String titulo, LocalDate lanzamiento, double duracion, Clasificacion clasificacion, String paisOrigen, String descripcion, int stock, Genero genero) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.stock = stock;
        this.genero = genero;
        this.numAlquileres = 0;
    }

    // ---------- methods

    public void printFilm()
    {
        System.out.println("Nombre Film: " + titulo);
        System.out.println("Lanzamiento: " + lanzamiento);
        System.out.println("Duracion: " + duracion);
        System.out.println("Clasificacion: " + clasificacion);
        System.out.println("Pais Origen: " + paisOrigen);
        System.out.println("Genero: " + genero);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Stock Disponible: " + stock);
        System.out.println("Veces Alquilada: " + numAlquileres);
    }









    // --------- getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getNumAlquileres() {
        return numAlquileres;
    }

    public void setNumAlquileres(int numAlquileres) {
        this.numAlquileres = numAlquileres;
    }
}


