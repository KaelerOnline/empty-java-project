package com.teaching.android;

public class Persona {          //Declaramos la clase y sus atributos.
    private String nombre;
    private float dinero;


    public Persona(String nombre, float dinero) {   //Creamos un método que permita recibir datos sobre
        this.nombre = nombre;                       //el nombre y dinero de una persona.
        this.dinero = dinero;
        System.out.println("Creada entrada para " + this.nombre + " con " + this.dinero + " dinero.");
    }

    public void Pagar(Persona p, float cantidad) {   //Creamos un método el cual permite a una persona
        this.dinero = this.dinero + cantidad;       //pagar a otra.
        p.dinero = p.dinero - cantidad;
        System.out.println(p.nombre + " paga a " + this.nombre + " " + cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public float getDinero() {                       //Creamos un método que permite obtener el valor
        return dinero;                              //de una variable privada de esta clase.
    }
}
