/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos;

import java.util.Arrays;

/**
 *
 * @author javier
 */
public class EstructurasDatos {

    public static void main(String[] args) {

        // Un array es una estructura de datos
        // Puede tener una dimensión (array o vector), dos (matriz), tres o más
        // Almacena parimitivos y objetos del mismo tipo
        // Tiene un nombre y para acceder a los elementos se usa un índice
        // Hay que indicar un tamaño c(número de elementos que almacena)
        // Declaración
        int[] a; // Se suele usar más a menudo
        int b[];

        // Instanciación. Array con 10 elementos tipo int
        a = new int[10];

        // Declarar e instanciar array de String de tamaño 100
        String[] muchosString = new String[100];

        // Acceso a los elementos con un índice(0 hasta 9)
        a[0] = 1;
        a[1] = 10;
        a[2] = 100;

        // a.lenght me dice el tamaño del array
        System.out.println("El tamaño del array a es : " + a.length);

        System.out.println("El elemento de posición 0 es " + a[0]);

        // No puedo acceder a elementos fuera del rango 0 a array.lenght-1
       // System.out.println("Excepciones al canto " + a[10]);
       
       //Recorrer arrays completos
       // for
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion i = "+i +" valor del array : "+a[i]);
            
        }
        
        System.out.println("------------------------------");
        
        //for mejorado
        for (int dato : a) {
            System.out.println(" valor del array : "+dato);
        }
        
        for (int j = 0; j < 100; j++) {
            muchosString[j]="1DAW";
        }
        
        for (String string : muchosString) {
            System.out.println(string);
        }
        
        for (int k = 0; k < muchosString.length; k++) {
            System.out.println("Posicion i = "+k +" valor del array : "+muchosString[k]);
        }
        
        int [] array = {3,5,89,4,32,91,100};
        
        for (int i : array) {
            System.out.print(i+"-");
        }
        
        // Ordenar el arrray usando la api de java
        Arrays.sort(array);
        
        System.out.println("");
        
        for (int i : array) {
            System.out.print(i+"-");
        }
        System.out.println("");
        // Para usar búsqueda binaria tengo que ordenar el array
        System.out.println("Posicion del elemento 89 es "+ Arrays.binarySearch(array, 88));
    }

}
