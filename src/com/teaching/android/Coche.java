package com.teaching.android;

public class Coche extends Vehiculo {
    private int plazas;
    private boolean extras;

    public Coche(int plazas, boolean extras, String matricula, String color, float precio) {
        super(matricula, color, precio);
        this.plazas = plazas;
        this.extras = extras;
    }
}
