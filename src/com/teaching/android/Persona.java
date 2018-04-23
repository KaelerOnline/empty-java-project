package com.teaching.android;

public class Persona {          //Declaramos la clase y sus atributos.
    private String nombre;
    private float dinero;

    /**
     * Constructor que recibe unos parámetros de clase String y Float y los asigna a un objeto de
     * clase Persona. Despues muestra en pantalla el resultado.
     * @param nombre de tipo String.
     * @param dinero de tipo Float.
     */
    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        System.out.println("Creada entrada para "+this.nombre+" con "+this.dinero+" dinero.");
    }

    /**
     * Método que hace que un objeto Persona page o otro.
     * @param p objeto de clase Persona que pagará.
     * @param cantidad objeto de clase Float que determina cuanto pagará p.
     */
    public void Pagar(Persona p, float cantidad) {   //Creamos un método el cual permite a una persona
        this.dinero = this.dinero + cantidad;       //pagar a otra.
        p.dinero = p.dinero - cantidad;
        System.out.println(p.nombre+" paga a "+this.nombre+" "+cantidad);
    }

    /**
     * Método que permite obtener el atributo nombre de un objeto de clase Persona pasado
     * como parámetro y mostrarlo en pantalla.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite obtener el atributo dinero de un objeto de clase Persona pasado
     * como parámetro y mostrarlo en pantalla
     * @return
     */
    public float getDinero() { //Creamos un método que permite obtener el valor
        return dinero;      //de una variable privada de esta clase.
    }
}
