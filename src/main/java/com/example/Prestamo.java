package com.example;

import java.time.LocalDate;

public class Prestamo {
    private Libro libroPrestado;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libroPrestado, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libroPrestado = libroPrestado;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

}