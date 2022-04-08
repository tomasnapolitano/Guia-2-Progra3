package com.company;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
	// EJERCICIO 1

        System.out.println("-------------  EJERCICIO 1  ------------");
        // a)
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(10);
        rectangulo.setAlto(12);

        // b)
        System.out.println("El alto del rectangulo es: " + rectangulo.getAlto());
        System.out.println("El ancho del rectangulo es: " + rectangulo.getAncho());
        // c)
        System.out.println("El area del rectangulo es: "+ rectangulo.areaRectangulo());
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.perimetroRectangulo());

        // d)
        rectangulo.setAncho(5);
        rectangulo.setAlto(6);

        // e)
        System.out.println("El alto del rectangulo es: " + rectangulo.getAlto());
        System.out.println("El ancho del rectangulo es: " + rectangulo.getAncho());

        System.out.println("El area del rectangulo es: "+ rectangulo.areaRectangulo());
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.perimetroRectangulo());

        // f)
        Rectangulo rectPorDefecto = new Rectangulo();

        System.out.println("RECTANGULO POR DEFECTO:");
        System.out.println("El alto del rectangulo es: " + rectPorDefecto.getAlto());
        System.out.println("El ancho del rectangulo es: " + rectPorDefecto.getAncho());

        System.out.println("El area del rectangulo es: "+ rectPorDefecto.areaRectangulo());
        System.out.println("El perimetro del rectangulo es: "+ rectPorDefecto.perimetroRectangulo());


        // EJERCICIO 2 ----------------------
        System.out.println("-------------  EJERCICIO 2  ------------");
        // a)
        Empleado empleado = new Empleado();

        empleado.setNombre("Carlos");
        empleado.setApellido("Gutierrez");
        empleado.setDni("23456345");
        empleado.setSalario(25000);
        // b)
        Empleado empleado2 = new Empleado();

        empleado2.setNombre("Ana");
        empleado2.setApellido("Sanchez");
        empleado2.setDni("34234123");
        empleado2.setSalario(27500);

        // c)
        empleado.printEmpleado();
        System.out.println("\n---------------\n");
        empleado2.printEmpleado();

        // d)
        empleado.aumentarSalario(15);
        System.out.println(empleado.getSalario());
        System.out.println("\nSalario anual de " + empleado.getNombre() + " " + empleado.getApellido() + " es: " + empleado.salarioAnual());

        // EJERCICIO 3
        System.out.println("-------------  EJERCICIO 3  ------------");

        // a)
        ItemVenta item = new ItemVenta(123, "Gallo Snacks",32,148);
        // b)
        item.printItem();

        // EJERCICIO 4
        System.out.println("-------------  EJERCICIO 4  ------------");

        // 1)
        CuentaBanco cuenta1 = new CuentaBanco(1,"Pepito",15000);

        // 2)
        cuenta1.credito(2500);
        // 3)
        cuenta1.debito(1500);
        // 4)
        cuenta1.debito(30000);
        // 5)
        cuenta1.printCuenta();

        // EJERCICIO 5
        System.out.println("-------------  EJERCICIO 5  ------------");

        Hora time = new Hora(22,45,0);


        for (int i=0; i<5000;i++)
        {
            time.printHora();
            time.avSeg();
        }

        for (int i=0; i<5000;i++)
        {
            time.printHora();
            time.retrSeg();
        }
    }
}
