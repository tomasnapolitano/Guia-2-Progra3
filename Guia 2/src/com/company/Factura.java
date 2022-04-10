package com.company;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {

    private UUID id;
    private ItemVenta[] items;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente comprador;


    public Factura(ItemVenta[] items, Cliente comprador) {
        this.id = UUID.randomUUID();
        this.items = items;
        this.montoTotal = calcularMontoTotal();
        this.fecha = LocalDateTime.now();
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", items=" + Arrays.toString(items) +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", comprador=" + comprador +
                '}';
    }

    public double calcularMontoTotal()
    {
        int total=0;
        for (ItemVenta item : items)
        {
            if (item != null)
            {
                total+=item.getPrecioUnitario();
            }
        }
        return total;
    }

    public double calcularMontoFinal ()
    {
        return (montoTotal - (montoTotal*0.01*comprador.getDescuento()));
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public ItemVenta[] getItems() {
        return items;
    }

    public void setItems(ItemVenta[] items) {
        this.items = items;
    }
}
