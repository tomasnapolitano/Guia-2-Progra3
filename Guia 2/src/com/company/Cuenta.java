package com.company;

import java.util.UUID;

public class Cuenta {
    private UUID id;
    private double balance;
    private ClienteEj3 cliente;
    private String[] operaciones;
    private int cantOperaciones;


    public Cuenta(double balance, ClienteEj3 cliente, String[] operaciones) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
        this.cantOperaciones = 0;
        this.operaciones = operaciones;
    }

    public void depositar (double monto)
    {
        if  (cantOperaciones<10)
        {
            cantOperaciones++;
            this.balance+=monto;
            registrarDeposito(monto);
        }
        else
            System.out.println("Se alcanzo el limite de operaciones.\n");
    }

    public void extraer (double monto)
    {
        if (cantOperaciones<10) {
            if (balance >= monto - 2000) {
                this.balance -= monto;
                cantOperaciones++;
                registrarExtraccion(monto);
            }
            else
                System.out.println("La cuenta no posee saldo suficiente.\n");
        }
        else
            System.out.println("Se alcanzo el limite de operaciones.\n");
    }

    private void registrarDeposito(double monto)
    {
        int i=0;
        while (operaciones[i]!=null)
        {
            i++;
        }
        operaciones[i]="El Cliente " + cliente.getNombre() +" deposito " + monto + " pesos.";
    }

    private void registrarExtraccion(double monto)
    {
        int i=0;
        while (operaciones[i]!=null)
        {
            i++;
        }
        operaciones[i]="El Cliente " + cliente.getNombre() +" extrajo " + monto + " pesos.";
    }

    public void printOperaciones ()
    {
        int i =0;
        while (operaciones[i]!=null)
        {
            System.out.println(operaciones[i]);
            i++;
        }
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteEj3 getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEj3 cliente) {
        this.cliente = cliente;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }

    public int getCantOperaciones() {
        return cantOperaciones;
    }

    public void setCantOperaciones(int cantOperaciones) {
        this.cantOperaciones = cantOperaciones;
    }
}
