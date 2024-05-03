package com.example;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Biblioteca {
    private List<Libro> inventario;
    private List<Prestamo> prestamosActivos;
    private List<Reserva> reservasActivas;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.reservasActivas = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' añadido al inventario.");
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (inventario.contains(libro) && libro.getEjemplaresDisponibles() > 0) {
            libro.setEjemplaresDisponibles(libro.getEjemplaresDisponibles() - 1);
            Prestamo prestamo = new Prestamo(libro, usuario, LocalDate.now(), LocalDate.now().plusDays(14));
            prestamosActivos.add(prestamo);
            System.out.println("El usuario " + usuario.getNombre() + " pidio el prestamo del libro: '" + libro.getTitulo() + "'");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no esta disponible para un prestamo.");
        }
    }

    public void reservarLibro(Libro libro, Usuario usuario) {
        Reserva reserva = new Reserva(libro, usuario);
        reservasActivas.add(reserva);
        System.out.println("El usuario " + usuario.getNombre() + " realizo una reserva al libro: '" + libro.getTitulo() + "'");
    }
}
