package com.teaching.android;

public class Pruebas {
    public static void  main (String[] args){
        String nombre= "Bolidos.Sl";
        String direccion= "Calle Falsa 123";
        int telefono= 923845781;

        try {
            Concesionario concesionario = new Concesionario(nombre, direccion, telefono);
            Coche c1 = new Coche(4, false, "MA123", "rojo", 15000f);
            concesionario.Insertar(c1);
            Coche c2 = new Coche(2, true, "MA456", "azul", 150000f);
            concesionario.Insertar(c2);
            Coche c3 = new Coche(6, true, "MA789", "bermejo", 50000f);
            concesionario.Insertar(c3);
            Moto m1 = new Moto(125, "MA213", "negro", 1500f);
            concesionario.Insertar(m1);
            Moto m2 = new Moto(250, "MA546", "verde", 2500f);
            concesionario.Insertar(m2);
            Moto m3 = new Moto(125, "MA879", "amarillo", 1750f);
            concesionario.Reservar(m2);
            concesionario.Buscar(m2);
            System.out.println(concesionario);
        } catch (ConcesionarioException ex) {
            System.out.println("Imposible insertar nuevo vehículo.");
            System.out.println("Error: " + ex);
        } catch (Exception ex) {
            System.out.println("Imposible encontrar vehículo.");
            System.out.println("Error: "+ ex);

        }










    }
}
