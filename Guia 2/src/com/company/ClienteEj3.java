package com.company;

import java.util.UUID;

public class ClienteEj3 {

    private UUID id;
    private String nombre;
    private char genero;

    public ClienteEj3(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }




    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
