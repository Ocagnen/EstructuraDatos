/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] a = {1, 3, 4, 5, 6, 7, 98, 5};
        System.out.println("Introduce número buscado");
        int buscado = tec.nextInt();
        int posicion = Actividad3.busqueda(a, buscado);

        if (posicion < 0) {
            System.out.println("El número buscado no está");
        } else {
            System.out.println("El número buscado aparece por primera vez en la posicion" + posicion);
        }

        int[] c = Actividad3.busquedaCompleta(a, buscado);
        Actividad3.mostrarArray(c);

    }

    public static int busqueda(int[] a, int b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;

    }

    // Devuelve todas las posiciones
    public static int[] busquedaCompleta(int[] a, int b) {

        int tamanio = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                tamanio++;
            }
        }
        int[] c;
        if (tamanio == 0) {
            c = new int[1];
            c[0] = -1;
        } else {
            c = new int[tamanio];

            int j = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == b) {

                    c[j] = i;
                    j++;
                }
            }
        }

        return c;

    }

    public static void mostrarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " tiene el valor " + a[i]);
        }
    }

}
