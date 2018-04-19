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
        System.out.println("7. Ejercicio 'Persona'.");
        System.out.println("8. Ejercicio 'Punto'.");
        System.out.println("9. Ejercicio 'Circulo'");
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
                    Thread.sleep(500);                 //Retrasa la impresión de los distintos tipos de variables.
                    System.out.println(b);
                    Thread.sleep(500);
                    System.out.println(c);
                    Thread.sleep(500);
                    System.out.println(s);
                    Thread.sleep(500);
                    System.out.println(i);
                    Thread.sleep(500);
                    System.out.println(l);
                    Thread.sleep(500);
                    System.out.println(f);
                    Thread.sleep(500);
                    System.out.println(d);
                    Thread.sleep(500);
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
                    Thread.sleep(500);                 //Retrasa la impresión de unas operaciónes aritméticas.
                    System.out.println(a + b);
                    Thread.sleep(500);
                    System.out.println(a - b);
                    Thread.sleep(500);
                    System.out.println(a * b);
                    Thread.sleep(500);
                    System.out.println(a / b);
                    Thread.sleep(500);
                    System.out.println(a % b);
                    Thread.sleep(500);
                    System.out.println(++a);
                    Thread.sleep(500);
                    System.out.println(--a);
                    Thread.sleep(500);
                    System.out.println(a++);
                    Thread.sleep(500);
                    System.out.println(a--);
                    Thread.sleep(500);
                    System.out.println(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 3:                                             //Práctica de lógica aritmética interna de java.
                System.out.println(" ");                      //Fuerza a crear un espacio en blanco como separador.
                try {
                    Thread.sleep(500);                 //Retrasa la impresión de unas operaciónes aritméticas.
                    System.out.println("2+5-3*2= " + (2 + 5 - 3 * 2));
                    Thread.sleep(500);
                    System.out.println("2*4*2/2= " + (2 * 4 * 2 / 2));
                    Thread.sleep(500);
                    System.out.println("1/2= " + (1 / 2));
                    Thread.sleep(500);
                    System.out.println("5*(1/2)= " + (5 * (1 / 2)));
                    Thread.sleep(500);
                    System.out.println("5f*(1/2)= " + (5f * 1 / 2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 4://Práctica de if/else con juego básico de par/impar
                try {
                    Thread.sleep(500);

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
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 5:                                         //Práctica de bucle while/do while con juego básico.
                boolean replay;                             //Declaramos booleano para la posibilidad de salir del juego.
                do {
                    System.out.println(" ");                //Menú de dificultad.
                    System.out.println("¿Como de dificil lo quieres?.");
                    System.out.println("1. Fácil (10 intentos)");
                    System.out.println("2. Intermedio (5 intentos)");
                    System.out.println("3. Difícil (3 intentos)");
                    int difficulty = keyboard.nextInt();
                    switch (difficulty) {                   //Declaraciones Switch/Case para las distintas dificultades.
                        case 1:
                            System.out.println("Has elegido FÁCIL.");
                            boolean guessed;                     //Declaramos un booleano.
                            int attempt = 10;                             //Declaramos un limitador.
                            Random generator = new Random();             //Hacemos que el sistema prepare un generador aleatorio.
                            int target = generator.nextInt(10) + 1;//Declaramos que una variable sea un número aleatorio.
                            do {                                         //Bucle para iniciar el juego.
                                System.out.println("Adivina del 1 al 10."); //Pide un numero para guardar.
                                int input = keyboard.nextInt();
                                if (input != target) {                      //Comparamos si el número introducido es distinto del generado.
                                    guessed = false;                     //Declaramos el booleano como falso.
                                    --attempt;                          //Le restamos al limitador.
                                    System.out.println("Incorrecto.");
                                    if (input > target) {                   //Comprueba si el número introducido es mayor.
                                        try {
                                            Thread.sleep(500);
                                            System.out.println("¡Menor!");
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        try {
                                            Thread.sleep(500);
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
                        case 2:
                            System.out.println("Has elegido INTERMEDIO.");
                            boolean guessed2;                     //Declaramos un booleano.
                            int attempt2 = 5;                             //Declaramos un limitador.
                            Random generator2 = new Random();             //Hacemos que el sistema prepare un generador aleatorio.
                            int target2 = generator2.nextInt(10) + 1;//Declaramos que una variable sea un número aleatorio.
                            do {                                         //Bucle para iniciar el juego.
                                System.out.println("Adivina del 1 al 10."); //Pide un numero para guardar.
                                int input2 = keyboard.nextInt();
                                if (input2 != target2) {                      //Comparamos si el número introducido es distinto del generado.
                                    guessed2 = false;                     //Declaramos el booleano como falso.
                                    --attempt2;                          //Le restamos al limitador.
                                    System.out.println("Incorrecto.");
                                    if (input2 > target2) {                   //Comprueba si el número introducido es mayor.
                                        try {
                                            Thread.sleep(500);
                                            System.out.println("¡Menor!");
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        try {
                                            Thread.sleep(500);
                                            System.out.println("¡Mayor!");
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.println("Intentos restantes:" + attempt2);  //Imprimimos en pantalla cuantos intentos quedan usando el limitador.
                                    }
                                } else {
                                    guessed2 = true;                      //Declaramos el booleano como verdadero si el número introducido coincide.
                                }
                            } while (!guessed2 && attempt2 > 0);         //Condiciones del bucle.

                            if (guessed2) {                          //Imprimimos el resultado final dependiendo de si hemos acertado o no.
                                System.out.println("¡Correcto!¡Y te quedaron " + (attempt2 - 1) + " intentos!");
                            } else {
                                System.out.println("Incorrecto.");
                                System.out.println("El número correcto era:" + target2);
                            }

                            break;
                        case 3:
                            System.out.println("Has elegido DIFÍCIL.");
                            boolean guessed3;                    //Declaramos un booleano.
                            int attempt3 = 3;                             //Declaramos un limitador.
                            Random generator3 = new Random();             //Hacemos que el sistema prepare un generador aleatorio.
                            int target3 = generator3.nextInt(10) + 1;//Declaramos que una variable sea un número aleatorio.
                            do {                                         //Bucle para iniciar el juego.
                                System.out.println("Adivina del 1 al 10."); //Pide un numero para guardar.
                                int input3 = keyboard.nextInt();
                                if (input3 != target3) {                      //Comparamos si el número introducido es distinto del generado.
                                    guessed3 = false;                     //Declaramos el booleano como falso.
                                    --attempt3;                          //Le restamos al limitador.
                                    System.out.println("Incorrecto.");
                                    if (input3 > target3) {                   //Comprueba si el número introducido es mayor.
                                        try {
                                            Thread.sleep(500);
                                            System.out.println("¡Menor!");
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        try {
                                            Thread.sleep(500);
                                            System.out.println("¡Mayor!");
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.println("Intentos restantes:" + attempt3);  //Imprimimos en pantalla cuantos intentos quedan usando el limitador.
                                    }
                                } else {
                                    guessed3 = true;                      //Declaramos el booleano como verdadero si el número introducido coincide.
                                }
                            } while (!guessed3 && attempt3 > 0);         //Condiciones del bucle.

                            if (guessed3) {                          //Imprimimos el resultado final dependiendo de si hemos acertado o no.
                                System.out.println("¡Correcto!¡Y te quedaron " + (attempt3 - 1) + " intentos!");
                            } else {
                                System.out.println("Incorrecto.");
                                System.out.println("El número correcto era:" + target3);
                            }

                            break;

                        default:
                            System.out.println("No has elegido una opción correcta.");
                            break;

                    }
                    System.out.println("¿Quieres volver a jugar? [S]i   [N]o"); //Preguntamos si se quiere salir o no.
                    String response = keyboard.next();
                    replay = response.equals("S");                              //Comprueba si hemos dicho si volver a jugar o no.
                } while (replay);
                break;

            case 6:                                     //Práctica básica de bucle FOR con números pares.
                for (int par = 0; par <= 40; par++) {   //Creamos un bucle que nos permita ver los 40
                    if (par % 2 == 0) {                 //primeros números, comprobamos si son primos
                        try {                           // y si lo son serán impresos en pantalla.
                            Thread.sleep(500);
                            System.out.println(par);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case 7:                                 //Práctica de creación y uso de clases y métodos.
                try {   //Cuando se hace uso de un método en una clase distinta para crear un objeto
                    System.out.println(" ");    //hay que decirle a la clase que va a crear un nuevo
                    Thread.sleep(500);                //objeto, lo que hará que pida atributos.
                    Persona p1 = new Persona("Paco", 200f);
                    Thread.sleep(500);
                    Persona p2 = new Persona("Pepe", 0f);
                    Thread.sleep(500);     //Es posible obtener atributos concretos de objetos.
                    System.out.println(p1.getNombre() + " tiene " + p1.getDinero());
                    Thread.sleep(500);
                    System.out.println(p2.getNombre() + " tiene " + p2.getDinero());
                    Thread.sleep(500);
                    p2.Pagar(p1, 200);
                    Thread.sleep(500);
                    System.out.println("Ahora " + p1.getNombre() + " tiene " + p1.getDinero());
                    Thread.sleep(500);
                    System.out.println("Ahora " + p2.getNombre() + " tiene " + p2.getDinero());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;
            case 8:                                 //Práctica de creación y uso de clases y métodos.
                try {
                    System.out.println(" ");
                    Thread.sleep(500);
                    Punto p1 = new Punto(2, 4);
                    Punto p2 = new Punto(3, 5);
                    Thread.sleep(500);
                    System.out.println("p1 " + p1);
                    System.out.println("p2 " + p2);
                    Thread.sleep(500);
                    System.out.println(p2.distanciaP(p1));
                    System.out.println(p2.distancia(2, 4));
                    Thread.sleep(1000);
                    p1.setX(3);     //Con set podemos cambiar atributos concretos de un objeto desde
                    p1.setY(5);        //fuera de la clase en la que se encuentra definido el método.
                    p2.setX(2);
                    p2.setY(4);
                    System.out.println("p1 es ahora {x=" + p1.getX() + ", y=" + p1.getY() + "}");
                    System.out.println("p2 es ahora {x=" + p2.getX() + ", y=" + p2.getY() + "}");
                    Thread.sleep(500);
                    System.out.println(p2.distanciaP(p1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;
            case 9:                                 //Práctica de creación y uso de clases y métodos.
                try {
                    System.out.println(" ");
                    Thread.sleep(500);
                    Circulo circulo = new Circulo(5,2,3);
                    Thread.sleep(500);
                    System.out.println(circulo);
                    System.out.println("con area "+circulo.getArea());
                    Thread.sleep(1000);
                    Punto p = new Punto(2,3);//Para que el método que pide un objeto de clase
                    Circulo circulo2 = new Circulo(p, 5);//punto funcione se há de crear un
                    System.out.println(circulo2);              //objeto en punto.
                    System.out.println("con circunferencia de "+circulo2.getCircumference());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;

            default://En caso de que Switch no encuentre un Case con un valor viable,
                    //el programa irá a la opcion por defecto y cerrará.
                System.out.println("No ha introducido una opción correcta.");
                break;
        }
    }
}
