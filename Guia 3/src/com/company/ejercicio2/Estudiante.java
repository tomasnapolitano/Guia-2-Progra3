package com.company.ejercicio2;

import java.time.LocalDate;

public class Estudiante extends Persona{

    private int anioIngreso;
    private double cuota;
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
