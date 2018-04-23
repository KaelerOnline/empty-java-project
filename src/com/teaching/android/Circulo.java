package com.teaching.android;

public class Circulo {

    private Punto centro;   //Creamos un atributo de clase Punto para los objetos de esta clase.
    private int radio;      //Creamos un atributo de clase integer para los objetos de esta clase.

    public Circulo() {      //Constructor vácuo.
    }

    /**
     * Constructor para un objedo de la clase Circulo.
     * @param radio es un parámetro de tipo Integer para ser asignado al atributo del mismo nombre.
     * @param x es un parámetro de tipo Integer para ser asignado a un atributo junto a y.
     * @param y es un parámetro de tipo Integer para ser asignado junto a x al
     *          atributo centro de clase Punto.
     */
    public Circulo(int radio, int x, int y) {
        this.radio = radio;
        this.centro = new Punto (x,y);
    }

    /**
     * Constructor para un objeto de clase Circulo.
     * @param centro es un parámetro de clase Punto para ser asignado como atributo.
     * @param radio es un parámetro de tipo Integer para ser asignado como atributo.
     */
    public Circulo(Punto centro, int radio) {   //Constructor para un objeto de esta clase que recibe
        this.centro = centro;                   //valores externos.
        this.radio = radio;
    }

    /**
     * Getters y Setters que no estamos utilizando para asignar y recibir valores de los atributos del
     * objeto asignado.
     * @return
     */
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

    /**
     * Método el cual devuelve un valor Double que define la circumferencia del objeto
     * Circulo definido definido como parámetro.
     * @return
     */
    public double getCircumference(){
        return 2* Math.PI * this.radio;
    }

    /**
     * Método el cual devuelve un valor Double que define el area del objeto
     * Circulo definido como parámetro.
     * @return
     */
    public double getArea(){
        return Math.PI * Math.pow(this.radio,2);
    }

    /**
     * Método que permite mostrar en pantalla los valores del objeto Circulo simplemente
     * haciendo llamada al objeto en sí.
     * @return
     */
    public String toString() {
        return "Circulo con centro en " + "(" + centro + ") y radio " + radio;
    }
}
