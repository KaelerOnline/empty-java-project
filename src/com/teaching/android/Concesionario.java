package com.teaching.android;

import java.util.Arrays;

public class Concesionario {
    private String nombre;
    private String direccion;
    private int telefono;
    private Vehiculo vehiculo [] = new Vehiculo[5];

    public Concesionario (String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void Insertar(Vehiculo v){
        for(int i=0; i<vehiculo.length; i++){
            if(vehiculo[i] == null){
                vehiculo[i]=v;
                break;
            }
        }
    }

    public String toString() {
        return "Concesionarios." + " Nombre= " + nombre + ", direccion= " + direccion + ", telefono= " + telefono + ", " + "\n" + Arrays.toString(vehiculo);
    }
}
