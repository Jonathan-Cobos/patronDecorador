/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador;

/**
 *
 * @author Acer
 */
public class Decorador implements LibroBiblioteca {
    private Libro libro;
    private String usuario;

    public Decorador(Libro libro) {
        this.libro = libro;
        
    }

    private void devolucion(String usuario) {
        
        System.out.println(" El usuario " + usuario + " devolvió el libro " + libro.getTitulo() );
    }
    
    
    @Override
    public void prestarLibro(String usuario) {
        if(libro.isPrestado()==false){
            System.out.println("El libro " + libro.getTitulo()+ " ha sido prestado a " + usuario);
        libro.prestarLibro(usuario);
        this.usuario=usuario;
        }  
        }

    @Override
    public void devolverLibro(String usuario) {
       
         if (usuario.equals(this.usuario)) {
             this.usuario=null;
             libro.devolverLibro(usuario);
            devolucion(usuario);
        } else {
            System.out.println("Este libro no puede ser devuelto por " + usuario);
        }
    }

    
}