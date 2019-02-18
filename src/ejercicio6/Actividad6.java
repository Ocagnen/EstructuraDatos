/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] a;
        int[] b;

        System.out.println("Introduce el tamaño del array 1");
        int tamanioA = tec.nextInt();
        while (tamanioA <= 0) {
            System.out.println("Valor introducido no valido, introduzca otro");
            tamanioA = tec.nextInt();
        }
        a = new int[tamanioA];

        System.out.println("Introduce el tamaño del array 2 (debe ser igual al de array 1) ");
        int tamanioB = tec.nextInt();
        while (tamanioB != tamanioA) {
            System.out.println("El valor inroducido es diferente al del array a (" + tamanioA + ")");
            System.out.println("Introduzca el mismo valor");
            tamanioB = tec.nextInt();
        }
        b = new int[tamanioB];

        for (int i = 0; i < a.length; i++) {
            Random numAlt = new Random();

            a[i] = numAlt.nextInt(100) + 1;
            b[i] = numAlt.nextInt(100) + 1;
        }

        int[] c = Actividad6.multiplicar(a, b);
        Actividad6.mostrarDatos(a);
        Actividad6.mostrarDatos(b);
        Actividad6.mostrarDatos(c);
    }

    public static int[] multiplicar(int[] a, int[] b) {
        int[] c;
        int multiplicacion = 0;
        c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            multiplicacion = a[i] * b[i];
            c[i] = multiplicacion;
        }

        return c;
    }

    public static void mostrarDatos(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("El valor de la posición " + i + " es de " + a[i]);
        }
    }

}
