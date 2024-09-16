/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Libro misLibros=new Libro();
        agregarLibros agregar=new agregarLibros();
        
        misLibros.titulo = agregar.titulos();
        misLibros.autor = agregar.autores();
        misLibros.anioPublicacion = agregar.publicacion();

        
        misLibros.mostrarInformacion();
    }
    
}
