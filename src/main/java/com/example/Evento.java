package com.example;

import java.time.LocalDate;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String descripcion;

    public Evento(String nombre, LocalDate fecha, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
