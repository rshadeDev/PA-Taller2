package com.example;

public class Reserva {
    private Libro libroReservado;
    private Usuario usuario;
    private boolean activa;

    public Reserva(Libro libroReservado, Usuario usuario) {
        this.libroReservado = libroReservado;
        this.usuario = usuario;
        this.activa = true;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}