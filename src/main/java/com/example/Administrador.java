package com.example;

import java.util.List;

public class Administrador {
    private String nombre;
    private List<Usuario> usuariosRegistrados;   
    private List<Evento> eventos;

    public Administrador(String nombre, List<Usuario> usuariosRegistrados, List<Evento> eventos) {
        this.nombre = nombre;
        this.usuariosRegistrados = usuariosRegistrados;
        this.eventos = eventos;
    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " registrado.");
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento " + evento.getNombre() + " agregado.");
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
        System.out.println("Evento " + evento.getNombre() + " eliminado.");
    }
}
