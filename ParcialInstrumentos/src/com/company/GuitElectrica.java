package com.company;

public class GuitElectrica extends deCuerda implements Amplificado{
    private String modelo;

    public GuitElectrica(double precio, String marca, String modelo) {
        super(precio, marca, 6);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GuitElectrica{" +
                "Precio: " + super.getPrecio() +
                ", Marca: " + super.getMarca() +
                ", Cant. Cuerdas: " + super.getCuerdas() +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println("GuitElectrica: SONIDO AMPLIFICADO");
    }

    @Override
    public void actualizarPrecio() {
        System.out.println("---- GUITARRA ELECTRICA ----");
        System.out.println("Precio Original: " + super.getPrecio());
        super.setPrecio(super.getPrecio()*1.05);
        System.out.println("Precio Actualizado: " + super.getPrecio());
    }
}
