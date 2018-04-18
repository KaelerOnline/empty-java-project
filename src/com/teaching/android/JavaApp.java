package com.teaching.android;

import java.util.Random;                                        //Declaramos paquetes de funciones que hay que importar para usar más tarde.
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        System.out.println("Práctica tipos primitivos. Elija:"); //Pide al usuario que introduzca un número.
        System.out.println("1. Demostración de tipos de variables.");
        System.out.println("2. Operaciones aritméticas básicas.");
        System.out.println("3. Demostración de la lógica aritmética de Java.");
        System.out.println("4. Par o Impar.");
        System.out.println("5. Simple juego de adivinación del número.");
        System.out.println("6. Impresión de los 20 primeros números pares.");
        Scanner keyboard = new Scanner(System.in);            //Hacemos que el sistema espere a que se introduzca un valor con el teclado.
        int valor = keyboard.nextInt();                       //Guardamos dicho valor como variable.
        switch (valor) {                                      //Efectua una comprobación de cual opción se ejecutará dependiendo de la variable.
            case 1:                                             //Práctica de impresión en pantalla de distintos tipos de variables con retraso.
                System.out.println(" ");
                byte b = 65;         //8bits
                char c = 'A';        //16bits
                short s = 65;        //16bits
                int i = 65;          //32bits
                long l = 65L;        //64bits
                float f = 65f;       //32bits
                double d = 65.55;    //64bits
                boolean bol = true;  //1bit
                try {
                    Thread.sleep(2500);                 //Retrasa la impresión de los distintos tipos de variables.
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(s);
                    System.out.println(i);
                    System.out.println(l);
                    System.out.println(f);
                    System.out.println(d);
                    System.out.println(bol);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:                                             //Práctica de lógica aritmética básica de java.
                int a = 10;
                b = 5;
                System.out.println(" ");                      //Fuerza a crear un espacio en blanco como separador.
                try {
                    Thread.sleep(2500);                 //Retrasa la impresión de unas operaciónes aritméticas.
                    System.out.println(a + b);
                    System.out.println(a - b);
                    System.out.println(a * b);
                    System.out.println(a / b);
                    System.out.println(a % b);
                    System.out.println(++a);
                    System.out.println(--a);
                    System.out.println(a++);
                    System.out.println(a--);
                    System.out.println(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 3:                                             //Práctica de lógica aritmética interna de java.
                System.out.println(" ");                      //Fuerza a crear un espacio en blanco como separador.
                try {
                    Thread.sleep(2500);                 //Retrasa la impresión de unas operaciónes aritméticas.
                    System.out.println(2 + 5 - 3 * 2);
                    System.out.println(2 * 4 * 2 / 2);
                    System.out.println(1 / 2);
                    System.out.println(5 * (1 / 2));
                    System.out.println(5f * 1 / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 4:                                         //Práctica de if/else con juego básico de par/impar
                System.out.println(" ");
                System.out.println("Introduzca un número."); //Pide un numero para guardar.
                int numero = keyboard.nextInt();
                if (numero % 2 == 0) {                          //Comprueba si la variable NUMERO es divisible por 2.
                    //En caso de serlo se imprimirá en pantalla que es par.
                    //En caso contrario se imprimirá en pantalla que es impar.
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
                break;
            case 5:                                         //Práctica de bucle while/do while con juego básico.
                boolean guessed = false;                     //Declaramos un booleano.
                int attempt = 3;                             //Declaramos un limitador.
                Random generator = new Random();             //Hacemos que el sistema prepare un generador aleatorio.
                int target = generator.nextInt(10) + 1;//Declaramos que una variable sea un número aleatorio.
                do {                                         //Bucle para iniciar el juego.
                    System.out.println(" ");
                    System.out.println("Adivina del 1 al 10."); //Pide un numero para guardar.
                    int input = keyboard.nextInt();
                    if (input != target) {                      //Comparamos si el número introducido es distinto del generado.
                        guessed = false;                     //Declaramos el booleano como falso.
                        --attempt;                          //Le restamos al limitador.
                        System.out.println("Incorrecto.");
                        if (input > target) {                   //Comprueba si el número introducido es mayor.
                            try {
                                Thread.sleep(0500);
                                System.out.println("¡Menor!");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                Thread.sleep(0500);
                                System.out.println("¡Mayor!");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Intentos restantes:" + attempt);  //Imprimimos en pantalla cuantos intentos quedan usando el limitador.
                        }
                    } else {
                        guessed = true;                      //Declaramos el booleano como verdadero si el número introducido coincide.
                    }
                } while (!guessed && attempt > 0);         //Condiciones del bucle.

                if (guessed) {                          //Imprimimos el resultado final dependiendo de si hemos acertado o no.
                    System.out.println("¡Correcto!¡Y te quedaron " + (attempt - 1) + " intentos!");
                } else {
                    System.out.println("Incorrecto.");
                    System.out.println("El número correcto era:" + target);
                }

                break;

            case 6:                                     //Práctica básica de bucle FOR con números pares.
                for (int par = 0; par <= 40; par++) {
                    if (par % 2 == 0) {
                        try {
                            Thread.sleep(0500);
                            System.out.println(par);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;

            default:                                        //En caso de que no se obtenga con Scanner un valor que valga para
                //Switch/Case, se irá a la opcion por defecto y cerrará.
                System.out.println("No ha introducido una opción correcta.");
                break;
        }
    }
}
