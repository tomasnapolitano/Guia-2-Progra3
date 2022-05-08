package com.company;

public class Bajo extends deCuerda implements Amplificado{
    private String modelo;


    public Bajo(double precio, String marca, String modelo) {
        super(precio, marca, 4);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Bajo{" +
                 "Precio: "+ super.getPrecio() +
                ", Marca: " + super.getMarca() +
                ", Cant. Cuerdas: " + super.getCuerdas() +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println("Bajo: SONIDO AMPLIFICADO");
    }

    @Override
    public void actualizarPrecio() {
        System.out.println("---- BAJO ----");
        System.out.println("Precio Original: " + super.getPrecio());
        super.setPrecio(super.getPrecio()*1.20);
        System.out.println("Precio Actualizado: " + super.getPrecio());
    }
}
