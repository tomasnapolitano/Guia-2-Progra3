package com.company;

public class Bateria extends Instrumento{

    private int tambores;
    private int platillos;

    public Bateria(String marca, int tambores, int platillos) {
        super(tambores*3000+platillos*2000, marca);
        this.tambores = tambores;
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "Precio: " + super.getPrecio() +
                ", Marca: " + super.getMarca() +
                ", tambores=" + tambores +
                ", platillos=" + platillos +
                '}';
    }

    @Override
    public void actualizarPrecio() {
        System.out.println("---- BATERIA ----");
        System.out.println("Precio Original: " + super.getPrecio());
        super.setPrecio(super.getPrecio()*1.15);
        System.out.println("Precio Actualizado: " + super.getPrecio());
    }
}
