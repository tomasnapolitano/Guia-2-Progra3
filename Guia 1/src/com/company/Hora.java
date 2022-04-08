package com.company;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if ((hora>=0) && (hora<=23))
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if ((minuto>=0) && (minuto<=59))
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if ((segundo>=0) && (segundo<=59))
        this.segundo = segundo;
    }

    public Hora(int hora, int minuto, int segundo) {
        if ((hora>=0) && (hora<=23))
            this.hora = hora;
        if ((minuto>=0) && (minuto<=59))
            this.minuto = minuto;
        if ((segundo>=0) && (segundo<=59))
            this.segundo = segundo;
    }

    public void printHora ()
    {
        System.out.printf("\nHora: %02d:%02d:%02d.",hora,minuto,segundo);
    }

    // Avanzar 1 s --------------------------------
    private void avHora()
    {
        if (hora==23)
        {
            this.hora=0;
        }
        else
            this.hora++;
    }

    private void avMin ()
    {
        if (minuto==59)
        {
            avHora();
            this.minuto=0;
        }
        else
            this.minuto++;
    }

    public Hora avSeg ()
    {
        if (segundo==59)
        {
            avMin();
            this.segundo=0;
        }
        else
            this.segundo++;

        return this;
    }

    // Retroceder 1 s --------------------------------------

    private void retrHora()
    {
        if (hora==0)
            this.hora=23;
        else
            this.hora--;
    }

    private void retrMin()
    {
        if (minuto==0)
        {
            retrHora();
            this.minuto=59;
        }
        else
            this.minuto--;
    }

    public Hora retrSeg ()
    {
        if (segundo==0)
        {
            retrMin();
            this.segundo=59;
        }
        else
            this.segundo--;
        return this;
    }



}
