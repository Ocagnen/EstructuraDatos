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
public class Libro {
    
    private String nombre;
    private String autor;
    private int numPag;

    public Libro(String nombre, String autor, int numPag) {
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
    

    public Libro() {
        
        this.autor = "";
        this.nombre ="";
        this.numPag = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
    
}
