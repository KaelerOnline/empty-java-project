package com.teaching.android;

public class Punto {            //Creamos una clase y le asignamos unos atributos.
    private int x;
    private int y;

    public Punto() {            //Creamos un constructor vacío.
    }

    /**
     * Getters y Setters que no estamos utilizando para asignar y recibir valores de los atributos del
     * objeto asignado.
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    /**
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

    /**
     * Constructor que permite asignar a un objeto de clase Punto con unos parametros Integer x e y.
     * @param x
     * @param y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que permite calcular la distancia de un objeto Punto a otro pasado como parámetro
     * y mostrar el resultado en consola.
     * @param p
     * @return
     */
    public double distanciaP(Punto p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    /**
     * Método que permite calcular la distancia de un objeto Punto a unas coordenadas pasadas
     * como parámetros de tipo Integer y mostrar el resultado en consola.
     * @param x objeto de tipo Integer.
     * @param y objeto de tipo Integer.
     * @return
     */
    public double distancia(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    /**
     * Método que permite mostrar los valores del objeto de clase Punto pasado como parámetro
     * cuando se le llame.
     * @return
     */
    public String toString() {  //Creamos un método que nos permite mostrar en pantalla los atributos
        return "x=" + x + ", y=" + y ;//de un objeto creado en un String cuando se le llame.
    }
}
