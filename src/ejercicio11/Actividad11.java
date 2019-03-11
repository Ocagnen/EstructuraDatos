/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Actividad11 {
    
    private static char[][] matriz = new char[2][3];

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public static void rellenarMatriz(){
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce un char para el array de fila "+i);                
                matriz[i][j]=tec.next().charAt(0);
            }
        }
    }
    
    public static void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            
        }
        System.out.println("");
        
        /*for(char[] y:matriz){
            for(char letra: x){
            
            letra;
        }
        */
        
        
        
    }

    
    
    
}
