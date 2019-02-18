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
        
        double[] b = new double[20];
        
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
        }
        
        System.out.println("");
        for (double d : a) {
            System.out.println(d);
        }
        
        System.out.println("");
        for (double d : b) {
            System.out.println(d);
        }
        
        System.out.println(Arrays.equals(a, b));
        
        a[alt.nextInt(a.length)]=6.3;
        
        System.out.println("");
        for (double d : a) {
            System.out.println(d);
        }
        
        System.out.println("");
        for (double d : b) {
            System.out.println(d);
        }
        
        System.out.println(Arrays.equals(a, b));
        
               
        
        
    }
    
}
