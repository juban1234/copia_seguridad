/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */


public class Persona {
    
    String nombre;
    int edad;
    String direccion;            
    
    String validar1() {
        String datos=JOptionPane.showInputDialog("ingrese el nombre ");
        return datos;
    }

    String validar3() {
        String datos=JOptionPane.showInputDialog("ingrese su direccion ");
        return datos;
    }
    
    int validar2() {
        int datos=Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
        return datos;
    }
    
    
    
    public void mostrarPersonas(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("direccion: "+direccion);
    }
    
}
