/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad12 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        int[] a = new int[21];

        do {
            System.out.println("Introduce un número entero entre 1 y 20");
            System.out.println("Introduce 0 salir");
            numero = tec.nextInt();
            while (numero < 0 || numero > 20) {
                System.out.println("Vuelve a introducir un número entre 1 y 20");
                numero = tec.nextInt();
            }
            if (numero != 0) {
                switch (numero) {
                    case 1:
                        a[numero] = a[numero] + numero;
                        break;
                    case 2:
                        a[numero] = a[numero] + numero;
                        break;
                    case 3:
                        a[numero] = a[numero] + numero;
                        break;
                    case 4:
                        a[numero] = a[numero] + numero;
                        break;
                    case 5:
                        a[numero] = a[numero] + numero;
                        break;
                    case 6:
                        a[numero] = a[numero] + numero;
                        break;
                    case 7:
                        a[numero] = a[numero] + numero;
                        break;
                    case 8:
                        a[numero] = a[numero] + numero;
                        break;
                    case 9:
                        a[numero] = a[numero] + numero;
                        break;
                    case 10:
                        a[numero] = a[numero] + numero;
                        break;
                    case 11:
                        a[numero] = a[numero] + numero;
                        break;
                    case 12:
                        a[numero] = a[numero] + numero;
                        break;
                    case 13:
                        a[numero] = a[numero] + numero;
                        break;
                    case 14:
                        a[numero] = a[numero] + numero;
                        break;
                    case 15:
                        a[numero] = a[numero] + numero;
                        break;
                    case 16:
                        a[numero] = a[numero] + numero;
                        break;
                    case 17:
                        a[numero] = a[numero] + numero;
                        break;
                    case 18:
                        a[numero] = a[numero] + numero;
                        break;
                    case 19:
                        a[numero] = a[numero] + numero;
                        break;
                    case 20:
                        a[numero] = a[numero] + numero;
                        break;
                }
            }

        } while (numero != 0);
        
        for (int i = 1; i < a.length; i++) {
            
            System.out.print(i+":");
            a[i]=a[i]/i;
            for (int j = 0; j < a[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
