/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Actividad19 {

    private ArrayList<Libro> lista;
    
    

    public int librosTotales() {
        return lista.size();
    }

    public void agregarLibro(Libro nuevo) {

        lista.add(nuevo);

    }
    
    public boolean eliminarLibroPosicion(int posicion){
        
        if (!lista.isEmpty() && posicion>=0 && posicion <= lista.size()){
            lista.remove(posicion);
            return true;
        }
        
        return false;
    }
    
    public Libro obtenerLibro (int posicion){
        
        if (lista.isEmpty()){
            return new Libro();
        }
        
        if(posicion<0 || posicion>lista.size()){
            return lista.get(0);
        }
        
        return lista.get(posicion);
    }
    
    public int buscarLibro(String nombre){
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        
        return -1;
        
    }
       

    @Override
    public String toString() {
        return "Actividad19{" + "lista=" + lista + '}';
    }

    public Actividad19() {
        lista = new ArrayList<>();
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

}
