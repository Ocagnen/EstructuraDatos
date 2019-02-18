/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author javier
 */
public class Actividad17 {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Actividad17.estaEnCadena(array, 11);

        Actividad17.estaEnCadena(array, 13);

    }

    public static int estaEnCadena(int[] b, int a) {
        
        int veces = 0;
        int n = b.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (b[centro] == a) {
                System.out.println("Numero de interacciones: " + veces);
                System.out.println(a+ " está en el array");
                return centro;
            } else if (a < b[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
            veces++;
        }
        System.out.println("Numero de interacciones: " + veces);
        System.out.println(a+" no está en el array");
        return -1;
    }
}
