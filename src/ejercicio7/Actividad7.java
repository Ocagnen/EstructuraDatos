/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad7 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array");
        int tamanio = tec.nextInt();
        Math.abs(tamanio);

        int[] a;
        a = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Introduce el valor de la posicion " + i);
            a[i] = tec.nextInt();

        }

        for (int i = 0; i < tamanio; i++) {

            int veces = 0;

            String st = "*";
            String acum = "";

            while (veces < a[i]) {
                acum = acum + st;
                veces++;
            }

            System.out.println(acum);
        }

    }

}
