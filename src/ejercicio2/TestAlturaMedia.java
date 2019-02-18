/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class TestAlturaMedia {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double[] a;

        System.out.println("Introduce el número de personas a considerar");
        int numeroPersonas;

        do {
            numeroPersonas = tec.nextInt();
        } while (numeroPersonas <= 0);

        a = new double[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            double valor = 0;
            System.out.println("Introducir altura de la Persona " + (i + 1) + " en cm");
            valor = tec.nextDouble();
            if (valor < 0) {
                valor = -1 * valor;
            }
            a[i] = valor;

        }

        for (int k = 0; k < a.length; k++) {
            System.out.println("Posicion a = " + k + " Altura de persona " + (k + 1) + " : " + a[k] + "cm");
        }
        double suma = 0;
        for (int i = 0; i < numeroPersonas; i++) {

            suma = suma + a[i];
        }

        double media = suma / numeroPersonas;
        System.out.println("Media de altura es igual a : " + media+" cm");

        int personasMasAltas = 0;
        int personasMasBajas = 0;

        for (int i = 0; i < numeroPersonas; i++) {
            if (a[i] > media) {
                personasMasAltas = personasMasAltas + 1;

            } else if (a[i] < media) {
                personasMasBajas = personasMasBajas + 1;
            }
        }

        System.out.println("Habrá " + personasMasAltas + " personas con una altura superior a la media");
        System.out.println("Habrá " + personasMasBajas + " personas con una altura inferior a la media");
    }

}
