/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesa;

/**
 *
 * @author javier
 */
public class Test {
    public static void main(String[] args) {
        
       // Declaración de un array de objetos Mesa 
       Mesa [] listaMesas;
       
       // Creamos el array con tamaño 5
       listaMesas = new Mesa[5];
       
       //Creación de una mesa
       Mesa oficina = new Mesa("Oficina",70.5);
       
       //Asignación el objeto oficina a una posición del array (se crea un alias)
       listaMesas [2]=oficina;
       listaMesas [0]=new Mesa("Juegos",50);
       listaMesas [1]=new Mesa("Comedor",1.10);
       listaMesas [3]=new Mesa("Ordenador",85);
       listaMesas [4]=new Mesa("Cocina",85);
       listaMesas [0]=new Mesa("Ordenador",85); // Machaca la información anterior
       
       //Recorrido del array con un for
        for (int i = 0; i < listaMesas.length; i++) {
            System.out.println(listaMesas[i]);
        }
        
        System.out.println("----------------");
       
       
       //Recorrido con foreach
        for (Mesa listaMesa : listaMesas) {
            System.out.println(listaMesa);
        }
        
        Mesa nueva = new Mesa ("Nueva",10);
        Mesa copia; // Null
        copia = listaMesas[1]; // Posicion 1 del array
        listaMesas[1]=nueva;
        
       
       
       
    }
    
   
    
}
