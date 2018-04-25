package com.teaching.android;

public abstract class Vehiculo {
    private String matricula;
    private String color;
    private boolean reservado = false;
    private float precio;

    public Vehiculo(String matricula, String color, float precio){
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
    }

    public void Reservar(boolean reservado) {
        this.reservado = reservado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return "{" + matricula+ " " + color + " " +  precio + "€" + '}';
    }
}
