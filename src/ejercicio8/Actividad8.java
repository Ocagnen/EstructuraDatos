/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad8 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int[] a;

        a = new int[10];
        Actividad8.asignarValores(a);
        Actividad8.mostrarArray(a);
        System.out.println("Cantidad de positivos " + Actividad8.calcularPositivos(a));
        System.out.println("Cantidad de negativos " + Actividad8.calcularNegativos(a));
        System.out.println("Cantidad de ceros " + Actividad8.calcularCeros(a));
        Actividad8.mediaNegativos(a);
        Actividad8.mediaPositivos(a);
        Actividad8.ordenarBubble(a);
        Actividad8.mostrarArray(a);

    }

    public static void asignarValores(int a[]) {
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + " (número entero)");
            a[i] = tec.nextInt();
        }
    }

    public static int calcularPositivos(int a[]) {
        int numerosPositivos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                numerosPositivos = numerosPositivos + 1;

            }

        }
        return numerosPositivos;
    }

    public static int calcularNegativos(int a[]) {
        int numerosNegativos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                numerosNegativos = numerosNegativos + 1;

            }

        }
        return numerosNegativos;
    }

    public static int calcularCeros(int a[]) {
        int ceros = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                ceros = ceros + 1;

            }

        }
        return ceros;
    }

    public static void mostrarArray(int a[]) {
        for (int k = 0; k < a.length; k++) {
            System.out.println("Posicion a = " + k + " Valor del array " + a[k]);
        }
    }

    public static void mediaPositivos(int[] a) {
        double suma = 0;
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                suma = suma + a[i];
                total++;
            }
        }

        if (total == 0) {
            System.out.println("La media de los números positivos será 0");
        } else {
            double media = suma / total;

            System.out.println("La media de los números positivos será: " + media);
        }
    }

    public static void mediaNegativos(int[] a) {
        double suma = 0;
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                suma = suma + a[i];
                total++;
            }
        }

        if (total == 0) {
            System.out.println("La media de los números negativos será 0");
        } else {
            double media = suma / total;

            System.out.println("La media de los números negativos será: " + media);
        }
    }

    public static void ordenarBubble(int[] arrayOrdenar) {

        int tmp;
        for (int i = 0; i < arrayOrdenar.length - 1; i++) {
            for (int j = i + 1; j < arrayOrdenar.length; j++) {
                if (arrayOrdenar[i] > arrayOrdenar[j]) {
                    tmp = arrayOrdenar[i];
                    arrayOrdenar[i] = arrayOrdenar[j];
                    arrayOrdenar[j] = tmp;
                }
            }
        }

    }

}
