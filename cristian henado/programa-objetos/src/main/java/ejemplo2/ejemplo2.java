/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author SENA
 */
public class ejemplo2 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "juan";
        estudiante.edad = 18;
        System.out.println("nombre: " + estudiante.nombre);
        System.out.println("edad: " + estudiante.edad);

        estudiante = new Estudiante();
        System.out.println("nombre: " + estudiante.nombre);
        System.out.println("edad: " + estudiante.edad);
  
    }
}
