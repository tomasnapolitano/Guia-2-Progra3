package com.company;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    // SETTERS Y GETTERS ------------------------------------------------
    public void setDni(String dni)
    {
        this.dni=dni;
    }
    public String getDni()
    {
        return dni;
    }

    public void setNombre(String nomb)
    {
        this.nombre=nomb;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setApellido(String ape)
    {
        this.apellido=ape;
    }
    public String getApellido() {
        return apellido;
    }

    public void setSalario(double sal)
    {
        this.salario=sal;
    }
    public double getSalario() {
        return salario;
    }
    // SETTERS Y GETTERS ------------------------------------------------

    public double salarioAnual ()
    {
        return salario*12;
    }

    public void aumentarSalario(double porc)
    {
        this.salario = salario + salario*(0.01*porc);
    }

    public void printEmpleado()
    {
        System.out.println("EMPLEADO " + this.nombre + " " + this.apellido + " [DNI: " + this.dni + ", Salario: " + this.salario + "]");
    }


}


