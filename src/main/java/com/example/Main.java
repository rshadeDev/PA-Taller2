package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "Fantasía", 3);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", 2);

        // Agregar libros a la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = Usuario.crearUsuario("Juan", "Estudiante");
        Usuario usuario2 = Usuario.crearUsuario("María", "Profesor");

        // Prestar libros
        biblioteca.prestarLibro(libro1, usuario1);
        biblioteca.prestarLibro(libro2, usuario2);

        // Realizar reservas
        biblioteca.reservarLibro(libro1, usuario2);

        // Mostrar historial de préstamos de un usuario
        System.out.println("Historial de préstamos de " + usuario1.getNombre() + ":");
        for (Libro libro : usuario1.getHistorialPrestamos()) {
            System.out.println("- " + libro.getTitulo());
        }

        // Mostrar eventos
        Administrador administrador = new Administrador("Admin", null, null);
        Evento evento = new Evento("Charla literaria", LocalDate.now(), "Charla sobre literatura contemporánea");
        administrador.agregarEvento(evento);
    }
}