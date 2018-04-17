package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

        public static void main(String[] args) {
            System.out.println("Práctica tipos primitivos"); // Display the string.
            byte b= 65;         //8bits
            char c= 'A';        //16bits
            short s= 65;        //16bits
            int i= 65;          //32bits
            long l= 65L;        //64bits
            float f= 65f;       //32bits
            double d= 65.55;    //64bits
            boolean bol= true;  //1bit
            try {                                           // Efectua un retraso antes de imprimir los valores.
                Thread.sleep(2500);
                System.out.println(b);
                System.out.println(c);
                System.out.println(s);
                System.out.println(i);
                System.out.println(l);
                System.out.println(f);
                System.out.println(d);
                System.out.println(bol);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            int a= 10;
            b= 5;
            System.out.println(" ");                        //Fuerza a crear un espacio en blanco como separador. Retrasa la impresión de unas operaciónes aritméticas.
            try {
                Thread.sleep(2500);
                System.out.println(a+ b);
                System.out.println(a- b);
                System.out.println(a* b);
                System.out.println(a/ b);
                System.out.println(a% b);
                System.out.println(++a);
                System.out.println(--a);
                System.out.println(a++);
                System.out.println(a--);
                System.out.println(a);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(" ");                        //Fuerza a crear un espacio en blanco como separador. Retrasa la impresión de unas operaciónes aritméticas.
            try {
                Thread.sleep(2500);
                System.out.println(2+5-3*2);
                System.out.println(2*4*2/2);
                System.out.println(1/2);
                System.out.println(5*(1/2));
                System.out.println(5f*1/2);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

    }

}
