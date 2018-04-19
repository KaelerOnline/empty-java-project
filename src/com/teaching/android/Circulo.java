package com.teaching.android;

public class Circulo {

    private Punto centro;   //Creamos un atributo de clase Punto para los objetos de esta clase.
    private int radio;      //Creamos un atributo de clase integer para los objetos de esta clase.

    public Circulo() {      //Constructor vácuo.
    }

    public Circulo(int radio, int x, int y) {   //Constructor para un objeto de esta clase que pide
        this.radio = radio;                     //valores de tipo integer.
        this.centro = new Punto (x,y);          //Crea un objeto de clase Punto como atributo.
    }

    public Circulo(Punto centro, int radio) {   //Constructor para un objeto de esta clase que recibe
        this.centro = centro;                   //valores externos.
        this.radio = radio;
    }

    public Punto getCentro() {                  //Getters y Setters
        return centro;                          //
    }                                           //
    public void setCentro(Punto centro) {       //
        this.centro = centro;                   //
    }                                           //
    public int getRadio() {                     //
        return radio;                           //
    }                                           //
    public void setRadio(int radio) {           //
        this.radio = radio;                     //
    }                                           //

    public double getCircumference(){           //Método que calcula y devuelve el resultado de la
        return Math.PI*Math.pow(this.radio,2);  //circunferencia/el area.
    }                                           //
    public double getArea(){                    //
        return Math.PI*Math.pow(this.radio,2);  //
    }                                           //

    public String toString() {                  //Método que permite imprimir en pantalla los
        return "Circulo con centro en " + "(" + centro + ") y radio " + radio;//atributos del objeto.
    }
}
