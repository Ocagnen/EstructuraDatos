/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author javier
 */
public class Avion {

    private boolean[][] asientos;

    public Avion() {
        this.asientos = new boolean[25][4];
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

    public boolean comprobarAsiento(int[] reserva) {
        if (!asientos[reserva[0]][reserva[1]]) {
            return true;
        } else {
            return false;
        }
    }

    public int reservarAsiento(int[] reserva) {
        if (comprobarAsiento(reserva)) {
            asientos[reserva[0]][reserva[1]] = true;
            return 1;
        } else {
            return -1;
        }

    }

    public void mostrarAvion() {

        for (int i = 0; i < asientos.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(" Asiento " + (j + 1));
                if (asientos[i][j]) {
                    System.out.print(" ocupado |");
                } else {
                    System.out.print(" libre |");
                }

            }
            System.out.println("");

        }

    }

}
