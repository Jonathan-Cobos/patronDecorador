/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador;

/**
 *
 * @author Acer
 */
public class Libro implements LibroBiblioteca {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }
    
    

    @Override
    public void prestarLibro(String usuario) {
         if (prestado==false) {
            
            prestado = true;
        } else {
            System.out.println("El libro " + titulo + " ya está prestado");
        }
    }

    @Override
    public void devolverLibro(String usuario) {
       if (prestado) { 
            prestado = false;
        } 
       else {
            System.out.println("El libro " + titulo + " no estaba prestado");
        }   
    }
}
