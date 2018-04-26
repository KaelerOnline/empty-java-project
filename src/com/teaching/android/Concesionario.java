package com.teaching.android;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Concesionario {
    private String nombre;
    private String direccion;
    private int telefono;
    private SortedSet<Vehiculo> vehiculo = new TreeSet<Vehiculo>();

    public Concesionario (String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void Reservar (Vehiculo v) {
        v.Reservar(true);
    }

    public void Insertar(Vehiculo v) throws ConcesionarioException {
        vehiculo.add(v);
    }

    public void Buscar (Vehiculo v) throws Exception {
        vehiculo.contains(v);
    }

    public String toString() {
        return "Concesionarios." + " Nombre= " + nombre + ", direccion= " + direccion + ", telefono= " + telefono + ", " + "\n" + vehiculo;
    }
}
