package com.example;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private String nombre;
    private List<Usuario> usuariosRegistrados = new ArrayList<>();   
    private List<Evento> eventos = new ArrayList<>();

    public Administrador(String nombre, List<Usuario> usuariosRegistrados, List<Evento> eventos) {
        this.nombre = "Administrador";
        this.usuariosRegistrados = usuariosRegistrados;
        this.eventos = eventos;
    }

    public Administrador() {}

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " registrado.");
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento: " + evento.getNombre() + " agregado, con fecha: " + evento.getFecha() + " y descripcion: " + evento.getDescripcion());
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
        System.out.println("Evento: " + evento.getNombre() + " eliminado, con fecha: " + evento.getFecha() + " y descripcion: " + evento.getDescripcion());
    }

    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public String getNombre() {
        return nombre;
    }
}
