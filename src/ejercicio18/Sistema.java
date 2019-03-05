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
public class Sistema {
    
    private static Avion a1 = new Avion();
    
    public static int[] menu(){
        Scanner tec = new Scanner(System.in);
        int[] reserva = new int[2];
        System.out.println("El estado de los asientos del vuelo son los siguientes");
        a1.mostrarAvion();
        
        System.out.println("");
        System.out.println("Introduzca el número de fila donde desea reservar el asiento");
        int fila = tec.nextInt();
        reserva[0]=fila-1;
        
        System.out.println("Introduzca el número de asiento que desea reservar");
        int asiento = tec.nextInt();
        reserva[1]=asiento-1;
        
        return reserva;
        
    }
    
    public static int confirmarReserva(int[] reserva){        
        
        int confirmacion = a1.reservarAsiento(reserva);
        
        return confirmacion;
        
    }
    
    
    
}
