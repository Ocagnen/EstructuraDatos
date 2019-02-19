/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.ArrayList;

import java.util.Random;

/**
 *
 * @author javier
 */
public class Actividad22 {

    

    private ArrayList<Double> listaA; //= new ArrayList<>(alt.nextInt(15 - 5) + 5);
    private  ArrayList<Double> listaB; 
    private  ArrayList<Double> listaC;// = new ArrayList<>(alt.nextInt(20 - 10) + 10);
    private  ArrayList<Double> listaD;
    
    private static int vecesA = 0;
    private static int vecesB = 0;
    private  int tamA ;
    private  int tamB ;

    public Actividad22() {
        Random alt = new Random();
        this.listaA = new ArrayList<>();
        this.listaB  = new ArrayList<>();
        this.listaC = new ArrayList<>();
        this.listaD = new ArrayList<>();
       this.tamA = alt.nextInt(15 - 5) + 5;
       this.tamB =alt.nextInt(20 - 10) + 10;
    }
    
    public  boolean incluirElementoListaA(double num){
        
        if(num<=100 && num>=50 && this.vecesA<this.tamA){
            this.listaA.add(num);
            this.vecesA++;
            return true;
        }
        return false;
    }
    
    public  boolean incluirElementoListaB(double num){
        
        if(num<=100 && num>=50 && this.vecesB<this.tamB){
            this.listaB.add(num);
            this.vecesB++;
            return true;
        }
         return false;
    }
    
      
    public  void mostrarListaA(){
        for (Double double1 : this.listaA) {
            System.out.println(double1);
        }
    }
    
    public  void mostrarListaB(){
        for (Double double1 : this.listaB) {
            System.out.println(double1);
        }
    }
    
    public  void rellenarListaC(){
        
        ArrayList<Integer> i = new ArrayList<>();
        
        for (int j = 0; j < listaA.size(); j++) {
            int prov = this.listaB.indexOf(this.listaA.get(j));
            
            if(prov<0){
                
                i.add(j);
            }
            
        }
        
        for (int j = 0; j < i.size(); j++) {
            
            this.listaC.add(this.listaA.get(i.get(j)));
        }
        
    }
    
    public void imprimirListaC(){
        for (Double double1 : listaC) {
            System.out.println(double1);
        }
    }
    
    public void rellenarListaD(){
        
        ArrayList<Integer> i = new ArrayList<>();
        int veces1=0;
        
        for (int j = 0; j < this.listaA.size(); j++) {
            
            if(this.listaA.get(j)%2 ==0){
                i.add(j);
                veces1++;
            }
        }
        
        for (int j = 0; j < this.listaB.size(); j++) {
            
            if(this.listaB.get(j)%2!=0){
                i.add(j);
                
            }  
            
        }        
        
        for (int j = 0; j < i.size(); j++) {
            
            if(j<=veces1){
                
                this.listaD.add(this.listaA.get(i.get(j)));
            } else {                
                this.listaD.add(this.listaB.get(i.get(j)));
            }
            
        }        
        
    }
    
    public  void imprimirListaD(){
        for (Double double1 : this.listaD) {
            System.out.println(double1);
        }
    }
    
    
    public ArrayList<Double> getListaA() {
        return listaA;
    }

    public ArrayList<Double> getListaB() {
        return listaB;
    }

    public ArrayList<Double> getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList<Double> listaC) {
        this.listaC = listaC;
    }

    public ArrayList<Double> getListaD() {
        return listaD;
    }

    public void setListaD(ArrayList<Double> listaD) {
        this.listaD = listaD;
    }

    public static int getVecesA() {
        return vecesA;
    }

    public static void setVecesA(int vecesA) {
        Actividad22.vecesA = vecesA;
    }

    public static int getVecesB() {
        return vecesB;
    }

    public static void setVecesB(int vecesB) {
        Actividad22.vecesB = vecesB;
    }

    public int getTamA() {
        return tamA;
    }

    public void setTamA(int tamA) {
        this.tamA = tamA;
    }

    public int getTamB() {
        return tamB;
    }

    public void setTamB(int tamB) {
        this.tamB = tamB;
    }

 
    

}
