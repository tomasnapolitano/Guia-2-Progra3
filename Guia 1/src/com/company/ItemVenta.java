package com.company;

public class ItemVenta {


    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;

    // SETTERS Y GETTERS -----------------------------------------------------------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    // SETTERS Y GETTERS -----------------------------------------------------------------------

    public ItemVenta(int id,String descripcion, int cantidad, double precioUnitario)
    {
        this.id=id;
        this.descripcion = descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
        this.precioTotal=precioUnitario*cantidad;

    }

    public void printItem ()
    {
        System.out.println("ItemVenta[id: " + id + ", descripcion: " + descripcion + ", cantidad: " + cantidad + ", pUnitario: " + precioUnitario + ", pTotal: " + precioTotal + "]");
    }



}
