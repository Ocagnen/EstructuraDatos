/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

/**
 *
 * @author javier
 */
public class PruebaLibro {
    
    public static void main(String[] args) {
        
        Actividad19 a = new Actividad19();
        
        Libro l = new Libro("Hola","Javier",230);
        Libro l1 = new Libro("Adios","Mano",500);
        Libro l2 = new Libro("Buenas","ana",290);
        
        a.agregarLibro(l);
        a.agregarLibro(l1);
        a.agregarLibro(l2);
        System.out.println(a);
        
        System.out.println(a.buscarLibro("Buenas"));
        
        a.eliminarLibroPosicion(0);
        System.out.println(a);
        
        System.out.println(a.librosTotales());
        
            
        
        
        
    }
    
}
