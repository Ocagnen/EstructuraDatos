/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Arrays;

/**
 *
 * @author javier
 */
public class Actividad5 {

    public static void main(String[] args) {

        // Primer caso
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        
        Actividad5.comparar(a, b);

        //Segundo caso
        int[] c = {1, 2, 3, 4};
        int[] d = {1, 2, 3};
        
        Actividad5.comparar(c, d);

        // Tercer caso
        int[] e = {1, 2, 3};
        int[] f = {1, 2, 2};
        
        Actividad5.comparar(e, f);

    }

    public static boolean comparar(int[] a, int[] b) {
        
        boolean igual = Arrays.equals(a, b);
        String respuesta = (igual) ? "Los arrays son iguales" : "Los arrays son diferentes";
        System.out.println(respuesta);
        return igual;

    }
}
