/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad13 {

    private static double[][] matriz = new double[3][3];

    public static double[][] getMatriz() {
        return matriz;
    }

    public static void setMatriz(double[][] matriz) {
        Actividad13.matriz = matriz;
    }

    public static void rellenarMatriz() {
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce un número para la posición " + j + "del array de la fila " + i);
                matriz[i][j] = tec.nextDouble();
            }
        }
    }

    public static double calcularMedia() {

        double sumaTotal = 0;
        int valoresTotales = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal = sumaTotal + matriz[i][j];
                valoresTotales++;
            }

        }

        return sumaTotal / valoresTotales;
    }

    public static double calcularMin() {
       
        double[] arrayP = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {            
                Arrays.sort(matriz[i]);
                arrayP[i]=matriz[i][0];    
            }
        Arrays.sort(arrayP);
        
        return arrayP[0];
        
        
        /* for (int x= 0; x<matriz.length; x++){
                for/int y=0; y<matriz[x].length; y++){
                    
                    if(matriz[x][y] 
        */        
        

        
    }
    
    public static double calcularMax() {
        
        double[] arrayP = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {            
                Arrays.sort(matriz[i]);
                arrayP[i]=matriz[i][matriz[i].length-1];    
            }
        Arrays.sort(arrayP);
        
        return arrayP[arrayP.length-1];  
        

    }
    
    

}
