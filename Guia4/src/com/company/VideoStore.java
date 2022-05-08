package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class VideoStore {
    private ArrayList<Cliente> clientes;
    private ArrayList<Film> films;
    private ArrayList<Alquiler> alquileres;

    public VideoStore(ArrayList<Cliente> clientes, ArrayList<Film> films) {
        this.clientes = clientes;
        this.films = films;
        this.alquileres = new ArrayList<Alquiler>();
    }

    // -------------- methods

    public Film buscarFilm(String titulo)
    {
        for (int i=0; i<films.size(); i++)
        {
            if (films.get(i)!=null && films.get(i).getTitulo().equals(titulo))
                return films.get(i);
        }
        return null;
    }

    public Cliente buscarCliente(String nombre)
    {
        for (int i=0; i<clientes.size(); i++)
        {
            if (clientes.get(i)!=null && clientes.get(i).getNombre().equals(nombre))
            {
                return clientes.get(i);
            }
        }
        return null;
    }

    public Cliente agregarCliente()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" --- Creando Nuevo Cliente ---");
        System.out.println(" - Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(" - Ingrese telefono: ");
        String telefono = scanner.nextLine();
        System.out.println(" - Ingrese direccion: ");
        String direccion = scanner.nextLine();

        Cliente clienteNuevo = new Cliente(nombre,telefono,direccion);
        clientes.add(clienteNuevo);

        return clienteNuevo;
    }




    public void alquilarFilm (String titulo, String nombreCliente)
    {
        Film filmAbuscar = buscarFilm(titulo);

        if (filmAbuscar!=null)
        {
               if (filmAbuscar.getStock() > 0)
               {
                   Cliente clienteAbuscar = buscarCliente(nombreCliente);
                   if (clienteAbuscar == null)
                   {
                       clienteAbuscar = agregarCliente();
                   }

                   filmAbuscar.setStock(filmAbuscar.getStock()-1);
                   filmAbuscar.setNumAlquileres(filmAbuscar.getNumAlquileres()+1);

                   Alquiler alquilerNuevo = new Alquiler(filmAbuscar,clienteAbuscar);
                   alquileres.add(alquilerNuevo);


               }
               else
                   System.out.println("La pelicula '" + titulo + "' no se encuentra en Stock en este momento.");
        }
        else
            System.out.println("La pelicula '" + titulo + "' se encuentra en nuestro listado.");

        System.out.println("\n--------- Fin del Alquiler ---------");
    }


    public Alquiler buscarAlquiler(UUID id)
    {
        for (int i=0 ; i<alquileres.size() ; i++)
        {
            if (alquileres.get(i)!=null && alquileres.get(i).getId().equals(id))
            {
                return alquileres.get(i);
            }
        }
        return  null;
    }

    public void devolverAlquiler(UUID id){
        Alquiler alquilerAbuscar = buscarAlquiler(id);
        if (alquilerAbuscar!=null)
        {
            alquilerAbuscar.setDevuelta(true);
            alquilerAbuscar.getAlquilada().setStock(alquilerAbuscar.getAlquilada().getStock()+1);
        }

    }


    // -------------- PRINTS

    public void printAlquileres()
    {
        System.out.println("--- Lista de Alquileres Vigentes ---");
        for (Alquiler alquiler : alquileres)
        {
            if (!alquiler.isDevuelta()) {
                System.out.println("* ------ *");
            }
            alquiler.printUnAlquiler();
        }
        System.out.println("---------- Fin de la Lista ---------");

    }

    public void printDevolucionesHoy()
    {
        System.out.println("--- Lista de Alquileres A Devolver HOY ---");
        for (Alquiler alquiler : alquileres)
        {
            if (!alquiler.isDevuelta() && alquiler.getDevolucion().equals(LocalDate.now()))  {
                System.out.println("* ------ *");
                alquiler.printUnAlquiler();
            }
        }
        System.out.println("---------- Fin de la Lista ---------");
    }


    public void printAlquileresPorCliente (String nombreCliente)
    {
        System.out.println("--- Lista de Alquileres: " + nombreCliente + " ---");
        int i=0;
        while (alquileres.get(i)!=null && i<10)
        {
            if (!alquileres.get(i).isDevuelta() && alquileres.get(i).getCliente().getNombre().equals(nombreCliente))
            {
                i++;
                System.out.println("     *****     ");
                alquileres.get(i).printUnAlquiler();
            }
        }
        System.out.println("-------- Fin de Lista --------");
    }


    public void printMasAlquilados ()
    {
        // como rechucha le hago
    }


    public void printFilmPorTitulo(String titulo)
    {
        int i=0;
        while (films.get(i)!=null && !films.get(i).getTitulo().equals(titulo))
        {
            i++;
        }

        if (films.get(i)!=null)
            films.get(i).printFilm();
    }




    // -------------- getters and setters

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
}
