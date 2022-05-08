package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private UUID id;
    private LocalDate retiro;
    private LocalDate devolucion;
    private Film alquilada;
    private Cliente cliente;
    private boolean devuelta;

    public Alquiler()
    {

    }

    public Alquiler(Film alquilada, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.retiro = LocalDate.now();
        this.devolucion = this.retiro.plusDays(2);
        this.alquilada = alquilada;
        this.cliente = cliente;
        this.devuelta = false;
    }

    // ------------ methods

    public void printUnAlquiler()
    {
        System.out.println("ID: " + id);
        System.out.println("Fecha de Retiro: " + retiro);
        System.out.println("Fecha de Devolucion: " + devolucion);
        System.out.println("Pelicula: " + alquilada.getTitulo());
        System.out.println("Cliente: " + cliente.getNombre());
    }





    // ------------ getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getRetiro() {
        return retiro;
    }

    public void setRetiro(LocalDate retiro) {
        this.retiro = retiro;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public Film getAlquilada() {
        return alquilada;
    }

    public void setAlquilada(Film alquilada) {
        this.alquilada = alquilada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isDevuelta() {
        return devuelta;
    }

    public void setDevuelta(boolean devuelta) {
        this.devuelta = devuelta;
    }
}
