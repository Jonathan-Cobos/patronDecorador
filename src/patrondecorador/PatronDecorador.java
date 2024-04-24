/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrondecorador;

/**
 *
 * @author Acer
 */
public class PatronDecorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        LibroBiblioteca libro = new Libro("El resplandor"); 
        libro = new Decorador((Libro) libro);
        
        
        
        libro.prestarLibro("mario");
        
    
        libro.devolverLibro("juan");
        libro.devolverLibro("mario");
    }
    }
    

