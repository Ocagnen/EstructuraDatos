/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        Actividad22 a = new Actividad22();

        System.out.println(Actividad22.getVecesA());
        System.out.println(a.getTamA());

        System.out.println("Lista A");
        a.incluirElementoListaA(55);
        a.incluirElementoListaA(67);
        a.incluirElementoListaA(51);
        a.incluirElementoListaA(95);
        a.incluirElementoListaA(56);
        a.incluirElementoListaA(88);
        a.mostrarListaA();

        
        System.out.println("Lista B");
        System.out.println(a.getTamB());
        a.incluirElementoListaB(55);
        a.incluirElementoListaB(58);
        a.incluirElementoListaB(99);
        a.incluirElementoListaB(83);
        a.incluirElementoListaB(86);
        a.incluirElementoListaB(84);
        a.incluirElementoListaB(67);
        a.incluirElementoListaB(95);
        a.mostrarListaB();
        
        System.out.println("Lista C");
        a.rellenarListaC();
        a.imprimirListaC();
        
        System.out.println("Lista D");
        a.rellenarListaD();
        a.imprimirListaD();
    }

}
