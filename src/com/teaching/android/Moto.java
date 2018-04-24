package com.teaching.android;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto (int cilindrada,  String matricula, String color, float precio){
        super(matricula, color, precio);
        this.cilindrada = cilindrada;
    }

}
