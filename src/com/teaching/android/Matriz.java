package com.teaching.android;

public class Matriz {

    private int Matriz [][];

    /**
     * Este método inicializa el objeto recibiendo un parámetro de tamaño para la matríz.
     * @param size es un parámetro de tipo Integer.
     */
    public Matriz (int size){
        Matriz = new int[size][size];   //Inicialización del objeto
    }

    /**
     * Este método permite asignar valores a los objetos Matríz con un array unidimensional
     * y un parámetro de tamáño para limitar el bucle.
     * @param vector es un parámetro de tipo Integer como array unidimensional.
     * @param size es un parámetro de tipo Integer.
     */
    public void AsignarDatos(int [] vector, int size){
        int indice=0;
        for (int ia=0; ia<size; ia++){
            for (int ib=0; ib<size; ib++){
                this.Matriz[ia][ib]=vector[indice++];   //Bucle para asignar valores al objeto.
            }
        }
    }

    /**
     * Este método permite mostrar en pantalla el objeto Matríz que se le asigne.
     */
    public void Mostrar (){
        try {
            for (int ia = 0; ia < Matriz.length; ia++) {
                Thread.sleep(500);
                for (int ib = 0; ib < Matriz.length; ib++) {
                    System.out.print(this.Matriz[ia][ib] + " ");    //Bucle para mostrar en pantalla
                }                                                   //los valores del objeto.
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Este método permite sumar una matriz con otra pasada como parámetro.
     * @param m es el objeto matríz pasado como parámetro
     */
    public void Suma (Matriz m){
        try{
            System.out.println();
            int[][] resultado;
            resultado = new int[Matriz.length][Matriz.length];
            for (int ia = 0; ia < Matriz.length; ia++) {                //Bucle para atravesar todos
                for (int ib = 0; ib < Matriz.length; ib++) {            //los índices de las matrices
                    resultado[ia][ib]=Matriz[ia][ib]+m.Matriz[ia][ib];  //y sumar sus valores.
                }
            }
            Thread.sleep(500);
            System.out.println("El resultado de la suma de matrices M1 y M2 es:");
            for (int ia = 0; ia < Matriz.length; ia++) {
                Thread.sleep(500);
                for (int ib = 0; ib < Matriz.length; ib++) {
                    System.out.print(resultado[ia][ib] + " ");    //Bucle para mostrar en pantalla
                }                                                 //los valores del objeto.
                System.out.println();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Este método permite multiplicar una matriz por otra pasada como parámetro.
     * @param m es el objeto matríz pasado como parámetro.
     */
    public void Producto (Matriz m){
        try{
            System.out.println();
            int[][] resultado;
            resultado = new int[Matriz.length][Matriz.length];
            for (int ia = 0; ia < Matriz.length; ia++) {                //Bucle para atravesar todos
                for (int ib = 0; ib < Matriz.length; ib++) {            //los índices de las matrices
                    resultado[ia][ib]=Matriz[ia][ib]*m.Matriz[ia][ib];  //y multiplicar sus valores.
                }
            }
            Thread.sleep(500);
            System.out.println("El resultado del producto de las matrices M1 y M2 es:");
            for (int ia = 0; ia < Matriz.length; ia++) {
                Thread.sleep(500);
                for (int ib = 0; ib < Matriz.length; ib++) {
                    System.out.print(resultado[ia][ib] + " ");      //Bucle para mostrar en pantalla
                }                                                   //los valores del objeto.
                System.out.println();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
