package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Film> filmsInic = new ArrayList<Film>();
        ArrayList<Cliente> clientesInic = new ArrayList<Cliente>();

        Film film1 = new Film("La bella y la bestia", LocalDate.of(2012,2,13),135,Clasificacion.G,"ARG","una peli muy buena",5,Genero.AVENTURA);
        Film film2 = new Film("Duro de Matar", LocalDate.of(2015,3,30),180,Clasificacion.PG13,"EEUU","una peli muy mala",3,Genero.ACCION);
        Film film3 = new Film("Click", LocalDate.of(2017,6,23),250,Clasificacion.PG13,"AZ","una peli",15,Genero.COMEDIA);

        filmsInic.add(film1);
        filmsInic.add(film2);
        filmsInic.add(film3);

        Cliente cliente1 = new Cliente("Pepito Musculos","1522331","champagnat al fondo");
        Cliente cliente2 = new Cliente("Alberto Munoz","5555444","Luro 8265");
        Cliente cliente3 = new Cliente("Alfonso de Villa Ortuzar","800034","Villa Ortuzar 324");

        clientesInic.add(cliente1);
        clientesInic.add(cliente2);
        clientesInic.add(cliente3);

        VideoStore storeRoberto = new VideoStore(clientesInic,filmsInic);
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");
        storeRoberto.alquilarFilm("La bella y la bestia","Pepito Musculos");

        storeRoberto.printAlquileres();
        storeRoberto.printDevolucionesHoy();
        storeRoberto.printAlquileresPorCliente("Pepito Musculos");






    }
}
