/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int respuesta = 0;

        do {

            int[] reserva = Sistema.menu();

            if (Sistema.confirmarReserva(reserva) == 1) {
                System.out.println("La reserva se realizó con éxito");
            } else {
                System.out.println("El asiento ya está ocupado, no ha sido posible realizar la reserva");
            }

            System.out.println("Si desea realizar otra reserva pulse 1");
            System.out.println("Si desea salir pulse 2");
            respuesta = tec.nextInt();
            while (respuesta != 1 && respuesta != 2) {
                System.out.println("Error,introduzca un número valido");
                System.out.println("Si desea realizar otra reserva pulse 1");
                System.out.println("Si desea salir pulse 2");
                respuesta = tec.nextInt();                
            }

        } while (respuesta == 1);

    }

}
