package com.company;

public class CuentaBanco {
    private int id;
    private String nombre;
    private double balance;

    public CuentaBanco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito (double aSumar)
    {
        this.balance+=aSumar;
        return balance;
    }

    public double debito (double aRestar)
    {
        if (balance<aRestar)
            System.out.println("\nNo posee el dinero suficiente en la cuenta!");
        else
            this.balance-=aRestar;

        return balance;
    }

    public void printCuenta ()
    {
        System.out.println("--- Cuenta ID: " + id + " ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Balance: " +balance);

    }
}
