/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad20 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce una frase");
        String frase = tec.nextLine();

        String[] a = frase.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Palabra " + (i + 1) + " es " + a[i]);
        }
        
       Actividad20.estaEnFrase(a);

    }

    public static void estaEnFrase(String[]a) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce la palabra que quieres buscar");
        String palabra = tec.nextLine();
        String palabraCorrec = palabra.trim();
        boolean esta = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(palabraCorrec)) {
                System.out.println("La palabra está en la frase, es la palabra número: " + (i+1));
                esta = true;
            }

        }
        if(esta==false){
        System.out.println("La palabra no está en la frase");
        }
    }

}
