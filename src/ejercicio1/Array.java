/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author javier
 */
public class Array {

    public static void main(String[] args) {

        int[] a ;
        
        //int[]a ={1,2,3,4,5,6}

        a = new int[6];
        int valores = 0;

        for (int i = 0; i < a.length; i++) {
            valores++;
            a[i] = valores;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println("Posicion a = " + k + " valor del array : " + a[k]);
        }

        int suma = 0;
        for (int j = 0; j < a.length; j++) {

            suma = a[j] + suma;

        }

        System.out.println("La suma es : " + suma);

    }
}
