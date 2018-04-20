package com.teaching.android;

public class Matriz {

    private int matriz [][];

    public Matriz (int size){
        matriz = new int[size][size];
    }

    public void AsignarDatos(int [] vector, int size){
        int indice=0;
        for (int ia=0; ia<size; ia++){
            for (int ib=0; ib<size; ib++){
                this.matriz[ia][ib]=vector[indice++];
            }
        }
    }

    public void Mostrar (){
        try {
            for (int ia = 0; ia < matriz.length; ia++) {
                Thread.sleep(500);
                for (int ib = 0; ib < matriz.length; ib++) {
                    System.out.print(this.matriz[ia][ib] + " ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
