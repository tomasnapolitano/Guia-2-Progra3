package com.company;

public class GuitAcustica extends deCuerda{
    private Madera madera;

    public GuitAcustica(double precio, String marca, Madera madera) {
        super(precio, marca, 6);
        this.madera = madera;
    }

    @Override
    public String toString() {
        return "GuitAcustica{" +
                "Precio: " + super.getPrecio() +
                ", Marca: " + super.getMarca() +
                ", Cant. Cuerdas: " + super.getCuerdas() +
                ", madera=" + madera +
                '}';
    }

    @Override
    public void actualizarPrecio() {
        System.out.println("---- GUITARRA ACUSTICA ----");
        System.out.println("Precio Original: " + super.getPrecio());
        super.setPrecio(super.getPrecio()*1.10);
        System.out.println("Precio Actualizado: " + super.getPrecio());
    }
}
