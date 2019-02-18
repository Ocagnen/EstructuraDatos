/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author javier
 */
public class Main {
    
    public static void main(String[] args) {
        
        ListaDeEnteros miLista = new ListaDeEnteros();
               
        miLista.generarLista(10);
        miLista.impirmirLista();
        miLista.sumaNumerosPares();
        System.out.println(miLista.devolverMayor());
        System.out.println(miLista.devolverMenor());
        System.out.println(miLista.tamanioLista());
        miLista.borrarElementoPosicion(2);
        miLista.impirmirLista();
        miLista.borrarElementoValor(22);
        miLista.impirmirLista();
        miLista.modificarElementoPos(2);
        miLista.impirmirLista();
    }
    
}
