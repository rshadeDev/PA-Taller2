package com.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String tipo; // Estudiante, Profesor, Personal de la Biblioteca
    private List<Libro> historialPrestamos;
    private List<Libro> librosReservados;
    private List<Integer> calificaciones;

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.historialPrestamos = new ArrayList<>();
        this.librosReservados = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public static Usuario crearUsuario(String nombre, String tipo) {
        Usuario usuario = new Usuario(nombre, tipo);
        return usuario;
    }

    public void agregarPrestamo(Libro libro) {
        historialPrestamos.add(libro);
    }

    public void realizarReserva(Libro libro) {
        librosReservados.add(libro);
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getHistorialPrestamos() {
        return historialPrestamos;
    }
}
