package com.company;

import com.company.ejercicio1.Cilindro;
import com.company.ejercicio2.Estudiante;
import com.company.ejercicio2.Persona;
import com.company.ejercicio2.Staff;
import com.company.ejercicio3.Circulo;
import com.company.ejercicio3.Cuadrado;
import com.company.ejercicio3.Rectangulo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // EJERCICIO 1

        Cilindro c1 = new Cilindro();
        System.out.println(c1.toString());
        Cilindro c2 = new Cilindro(6,"amarillo");
        System.out.println(c2.toString());
        Cilindro c3 = new Cilindro(5,"violeta",3);
        System.out.println(c3.toString());



        System.out.println("Area de base de cilindro (Sin Inicializar): " + c1.calcularArea() + " u^2."); // ahora calcula el área del cilindro, no de su base
        System.out.println("Volumen del cilindro (Sin Inicializar): " + c1.calcularVolumen() + " u^3."); // ya que se Overrideó el método en clase Cilindro
        System.out.println("Area de base de cilindro (Inicializado): " + c3.calcularArea() + " u^2.");
        System.out.println("Volumen del cilindro (Inicializado): " + c3.calcularVolumen() + " u^3.");

        System.out.println("Area del cilindro: " + c3.calcularArea());
        System.out.println("Volumen del cilindro: " + c3.calcularVolumen());

        // EJERCICIO 2

        Estudiante e1 = new Estudiante("78456121", "pepon", "magia","pepoloco@gmail.com","Calle falsa 1234", 2021,5000,"programacion");
        Estudiante e2 = new Estudiante("12344566", "vainilla", "minecraft","minecraf.vanilla@gmail.com","Calle falsa 4321", 2019,5000,"programacion");
        Estudiante e3 = new Estudiante("84451322", "jose", "bertole","josesito19@gmail.com","Calle falsa 1212", 2020,5000,"programacion");
        Estudiante e4 = new Estudiante("12133554", "ambrosio", "lopez","ambrocapo@gmail.com","Calle falsa 44444", 2031,5000,"programacion");

        Staff s1 = new Staff("1","profesor Mario","Bros","marito1978@yahoo.com.ar","askamsf 233",80000,'m');
        Staff s2 = new Staff("2","profesor Andromeda","Piola","galaxia@yahoo.com.ar","askamsf 442",80000,'n');
        Staff s3 = new Staff("3","Secretario Marcos","Tronco","iheartpapers@yahoo.com.ar","askamsf 1233",80000,'m');
        Staff s4 = new Staff("4","Limpieza Ferreira","Lopez","ferreiralimpy@yahoo.com.ar","askamsf 5532",80000,'n');


        Persona[] personas = new Persona[8];

        personas[0]=e1;
        personas[1]=e2;
        personas[2]=e3;
        personas[3]=e4;
        personas[4]=s1;
        personas[5]=s2;
        personas[6]=s3;
        personas[7]=s4;


        // recorremos el arreglo de Personas contando estudiantes y staff.

        int contE=0, contS=0;
        double ingresosTot=0.0;

        for (Persona p : personas)
        {
            if (p instanceof Estudiante) {
                contE++;
                ingresosTot+= ((Estudiante) p).getCuota();
            }
            else if (p instanceof Staff)
                contS++;
        }

        System.out.println("Cantidad Estudiantes: " + contE);
        System.out.println("Cantidad Staff: " + contS);
        System.out.println("Ingresos totales por cuotas: " + ingresosTot);




        // EJERCICIO 3

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo("rojo",2.5);
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo("verde",2,5);

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);


        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado("rosa",2);

        System.out.println(cuadrado1);
        System.out.println(cuadrado2);

        System.out.println(cuadrado1.calcularArea());
        System.out.println(cuadrado1.calcularPerimetro());
        System.out.println(cuadrado2.calcularArea());
        System.out.println(cuadrado2.calcularPerimetro());
    }
}
