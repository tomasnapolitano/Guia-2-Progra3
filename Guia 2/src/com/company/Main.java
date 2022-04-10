package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------- Ejercicio 1 ----------------------");

        // a)
        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor[] autores =new Autor[2];
        autores[0]=autor1;
        // b)
        System.out.println(autor1.toString());
        // c)
        Libro libro =   new Libro("Effective Java",450,150,autores);
        // d)
        System.out.println(libro.toString());
        // e)
        libro.setPrecio(500);
        libro.sumarStock(50);
        // f)
        System.out.println(Arrays.toString(libro.getAutor()));
        // g)
        System.out.println(libro.printMsg());
        // h) Listo
        // al imprimir el array de autores, muestra null por cada espacio del array sin ocupar. Habría que verificar si es null para no mostrarlo.



        System.out.println("\n--------------------- Ejercicio 2 ----------------------");

        // b)
        Cliente cliente1 = new Cliente("Carlosss","carlitoCademia@yahoo.com.ar",30);

        System.out.println(cliente1);
        // c)
        ItemVenta[] items1 = new ItemVenta[2];
        ItemVenta item0 = new ItemVenta("Test","esto es un test", 400);

        items1[0] = item0;

        Factura factura1 = new Factura(items1,cliente1);
        System.out.println("Monto total: " + factura1.getMontoTotal());
        System.out.println("Monto final: " + factura1.calcularMontoFinal());

        // d)
        System.out.println(factura1);

        // e)
        ItemVenta item1 = new ItemVenta("burger", "hamb urger",600);
        ItemVenta item2 = new ItemVenta("papas", "(fritas)",200);
        ItemVenta item3 = new ItemVenta("escoba", "(para limpiar)",1200);
        ItemVenta item4 = new ItemVenta("celular", "Samsung A30",50000);

        ItemVenta[] items2 = new ItemVenta[4];
        items2[0]=item1;
        items2[1]=item2;
        items2[2]=item3;
        items2[3]=item4;

        Factura factura2 = new Factura(items2,cliente1);

        System.out.println(factura2);

        System.out.println("Monto total: " + factura2.getMontoTotal());
        System.out.println("Monto final: " + factura2.calcularMontoFinal());


        System.out.println("\n--------------------- Ejercicio 3 ----------------------");

        // a)
        ClienteEj3 clienteMario = new ClienteEj3("mario",'M');
        System.out.println(clienteMario.toString());

        // b)
        String[] operaciones = new String[10];
    Cuenta cuenta1 = new Cuenta(10000,clienteMario,operaciones);
        // c)


        System.out.println(cuenta1.getBalance());
        cuenta1.depositar(5000);
        System.out.println("Agregamos 5000 pesos...");
        System.out.println(cuenta1.getBalance());
        cuenta1.extraer(7000);
        System.out.println("Extraemos 7000 pesos...");
        System.out.println(cuenta1.getBalance());
        System.out.println("Extraemos 10000 pesos...");
        cuenta1.extraer(10000);
        System.out.println(cuenta1.getBalance());
        System.out.println("Extraemos 200 pesos...");
        cuenta1.extraer(200);
        System.out.println(cuenta1.getBalance());
        cuenta1.depositar(5000);
        cuenta1.depositar(5000);

        cuenta1.printOperaciones();






    }
}
