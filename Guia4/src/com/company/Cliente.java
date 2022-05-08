package com.company;

public class Cliente {
    private String nombre;
    private String telef;
    private String direc;


    public Cliente()
    {

    }

    public Cliente(String nombre, String telef, String direc) {
        this.nombre = nombre;
        this.telef = telef;
        this.direc = direc;
    }

    // --------- methods





    // -------- getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }
}
