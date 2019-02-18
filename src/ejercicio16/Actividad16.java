/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase");
        
        String frase = teclado.next();
        
        String sinEspacio = frase.trim();
        System.out.println(sinEspacio);
        
        String minusculas = sinEspacio.toLowerCase();
        
        char[]a = new char[minusculas.length()];
        
        for (int i = 0; i < a.length; i++) {
            a[i]=minusculas.charAt(i);
        }
        
        Arrays.sort(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        
        
    }
    
}
