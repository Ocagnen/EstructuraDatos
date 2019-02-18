/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Random;

/**
 *
 * @author javier
 */
public class Actividad15 {
    

    private boolean[] moneda;

    public Actividad15() {
        Random alt = new Random();
        this.moneda = new boolean[alt.nextInt(1000)];
    }

    public void rellenarArray() {
        Random alt = new Random();
        for (int i = 0; i < this.moneda.length; i++) {
            moneda[i] = alt.nextBoolean();
        }
    }

    public int numeroCaras() {
        int caras = 0;
        for (int i = 0; i < this.moneda.length; i++) {
            if (this.moneda[i]) {
                caras++;
            }
        }

        return caras;
    }

    public int numeroCruces() {
        int cruces = 0;
        for (int i = 0; i < this.moneda.length; i++) {
            if (!this.moneda[i]) {
                cruces++;
            }
        }

        return cruces;
    }

    public void mostrarResultados() {

        for (int i = 0; i < this.moneda.length; i++) {
            if (this.moneda[i]) {
                System.out.println("Cara");

            } else {
                System.out.println("Cruz");
            }
        }
    }
    
    

    public static void main(String[] args) {
        Actividad15 a = new Actividad15();

        a.rellenarArray();
        System.out.println(a.numeroCaras());
        System.out.println(a.numeroCruces());
        a.mostrarResultados();
    }

}
