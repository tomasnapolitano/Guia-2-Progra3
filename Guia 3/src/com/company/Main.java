package com.company;

import com.company.ejercicio1.Cilindro;

public class Main {

    public static void main(String[] args) {

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



    }
}
