/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author javier
 */
public class AlturaMedia {
    
    private double altura;
    private int numPersonas;
    
    public AlturaMedia(){
        
    }

    public AlturaMedia(double altura, int numPersonas) {
        this.altura = altura;
        this.numPersonas = numPersonas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    @Override
    public String toString() {
        return "AlturaMedia{" + "altura=" + altura + ", numPersonas=" + numPersonas + '}';
    }
    
    
    
}
