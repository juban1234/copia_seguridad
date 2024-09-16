/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author SENA
 */
public class Estudiante {
    String nombre;
    int edad;
    String cedula;
    String telefono;
    boolean matricula;
    
    public Estudiante(){
        System.out.println("nuevo estudiante");
        nombre="defaul";
        edad=0;
        telefono="3r32r3r";
    }
    
    public void matricularse(){
        System.out.println(nombre+" solicita matricula");
        System.out.println(" iniciando solicitud de maticula...");
        matricula=true;
    }
    
    public String registrarMAtricula(){
        String resp="";
        
        if (matricula==true) {
            resp="ok";
        }
        
        return resp;
    }
    
}
