/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Javier
 */
public class Actividad24 {

    public static void main(String[] args) {

        Random alt = new Random();

        double[] a = new double[20];

        Arrays.fill(a, 7.5);

        double[] b = Arrays.copyOf(a, 20);

        Arrays.toString(a);
        Arrays.toString(b);

        System.out.println(Arrays.equals(a, b));

        a[alt.nextInt(a.length)] = 6.3;

        Arrays.toString(a);
        Arrays.toString(b);
        

        System.out.println(Arrays.equals(a, b));

    }

}
