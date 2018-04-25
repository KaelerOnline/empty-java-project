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

    public void Insertar(Vehiculo v) throws ConcesionarioException {
            int i=0;
            if(i>=vehiculo.length) {
                throw new ConcesionarioException("Entrada fuera de índice de Array.");
            }else{
                for (; i < vehiculo.length; i++) {
                    if (vehiculo[i] == null) {
                        vehiculo[i] = v;
                        break;
                    }
                }
            }
    }

    public void Buscar (Vehiculo v) throws BuscarException {
        int i=0;
        if(i<vehiculo.length){
            for (; i<vehiculo.length; i++) {
                if (v.getMatricula().equals(vehiculo[i].getMatricula())) {
                    System.out.println(v);
                }
            }
        } else throw new BuscarException("El índice de Array ha excedido su longitud.");
    }

    public String toString() {
        return "Concesionarios." + " Nombre= " + nombre + ", direccion= " + direccion + ", telefono= " + telefono + ", " + "\n" + Arrays.toString(vehiculo);
    }
}
