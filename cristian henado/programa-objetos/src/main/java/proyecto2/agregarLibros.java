/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
class agregarLibros {

    String titulos() {
        String titulos1 = JOptionPane.showInputDialog("cual es el titulo de el libro");
        return titulos1;
    }
    
    String autores() {
        String autor = JOptionPane.showInputDialog("cual es el autor del libro");
        return autor;
    }
    
    int publicacion(){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("que dia salio"));
        return dia;
    }
}
