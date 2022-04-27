package com.company.ejercicio2;

public class Staff extends Persona{

    private double salario;
    private char turno; //mañana (m) o noche (n)

    public Staff()
    {
        super();
    }

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, char turno)
    {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual ()
    {
        return 12*salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
}
