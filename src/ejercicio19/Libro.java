/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Objects;

/**
 *
 * @author javier
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private int numPag;
    private String isbn;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + this.numPag;
        hash = 59 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        //Se hace uso del polimorfismo. Conversión explícita de tipos
        final Libro other = (Libro) obj;
        if (this.numPag != other.numPag) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
    
    
    

    public Libro(String nombre, String autor, int numPag, String isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
        this.isbn=isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
