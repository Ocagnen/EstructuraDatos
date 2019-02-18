/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class ListaDeEnteros {

    // Declaración del atributo
    private ArrayList<Integer> lista;

    public ListaDeEnteros() {
        lista = new ArrayList<>();
    }

    public void generarLista(int tamanio) {

        Random alt = new Random();
        int aleatorio;
        for (int i = 0; i < tamanio; i++) {
            aleatorio = alt.nextInt(100 - 10 + 1) + 10;
            lista.add(aleatorio);
        }

    }

    public void impirmirLista() {
        for (Integer integer : lista) {
            System.out.print(integer + " ");
        }
        System.out.println("");

    }

    public void sumaNumerosPares() {
        int resultado;
        int suma = 0;
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            resultado = (lista.get(i)) % 2;
            if (resultado == 0) {

                System.out.println(suma + "+" + lista.get(i));
                suma = suma + lista.get(i);

            }
        }

        System.out.println("Los valores pares suman en total : " + suma);
    }

    public void sumaNumeroImpares() {
        int resultado;
        int suma = 0;
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            resultado = (lista.get(i)) % 2;
            if (resultado != 0) {

                System.out.println(suma + "+" + lista.get(i));
                suma = suma + lista.get(i);

            }
        }

        System.out.println("Los valores impares suman en total : " + suma);

    }

    public int devolverMayor() {
        int[] a = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            a[i] = lista.get(i);
        }
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public int devolverMenor() {
        int[] a = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            a[i] = lista.get(i);
        }
        Arrays.sort(a);
        return a[0];
    }
    
    public int tamanioLista(){
        return lista.size();
    }
    
    public void borrarElementoPosicion(int a){
        lista.remove(a);
    }
    
    public void borrarElementoValor(int a){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)==a){
                lista.remove(i);
            }
        }
    }
    
    public void modificarElementoPos(int a){
        System.out.println("");
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el valor que quieres añadir en lugar del de posicion "+a);
        int nuevoValor = tec.nextInt();
        lista.add(a, nuevoValor);
    }

}
