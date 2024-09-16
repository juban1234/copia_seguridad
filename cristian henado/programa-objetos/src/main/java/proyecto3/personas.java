/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

/**
 *
 * @author SENA
 */
public class personas {
    
    public static void main(String[] args) {
       
        
        Persona agregar=new Persona();
        
         agregar.nombre = agregar.validar1();
         agregar.edad = agregar.validar2();
         agregar.direccion = agregar.validar3();

        agregar.mostrarPersonas();
    }
}
