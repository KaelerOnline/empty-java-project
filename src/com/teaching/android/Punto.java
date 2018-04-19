package com.teaching.android;

public class Punto {            //Creamos una clase y le asignamos unos atributos.
    private int x;
    private int y;

    public Punto() {            //Creamos un constructor vacío.
    }

    public void setX(int x) {   //Creamos métodos que nos permitirán asignar valores concretos
        this.x = x;             //a los atributos concretos de los objetos que se crearán con set.
    }                           //
    //get nos permite obtener los atributos concretos de los objetos
    public int getX() {         //creados para ser usados fuera de la clase.
        return x;               //
    }                           //
    public void setY(int y) {   //
        this.y = y;             //
    }                           //
    public int getY() {         //
        return y;               //
    }                           //
    
    public Punto(int x, int y) {//Creamos un constructor que nos permite crear objetos con atributos
        this.x = x;             //de una sentada.
        this.y = y;
    }

    public double distanciaP(Punto p) { //Creamos un método que nos permite calcular la distancia de
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));//un punto a otro.
    }

    public double distancia(int x, int y) {//Creamos un método que nos permite calcular la distancia
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));//de unas coordenadas a
    }                                                                       //un punto.

    public String toString() {  //Creamos un método que nos permite mostrar en pantalla los atributos
        return "es {" + "x=" + x + ", y=" + y + '}';//de un objeto creado en un String cuando se le llame.
    }
}
