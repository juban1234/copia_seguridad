/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *2. Algoritmo que calcule solicite el nombre y la materia de * un estudiante, así como 3 notas parciales
 * y con esto calcule el promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 
 * 3.5 entonces indique que el estudiante ganó la materia, de lo contrario indique que la perdió,
 * en caso de perderla valide si se perdió con una nota mayor a 2.5 entonces el estudiante puede recuperar,
 * el mensaje deberá mencionar el nombre y
 * la materia del estudiante. valide que las notas no sean negativas y esten entre 0 y 5
 */

public class Formulas {
    
    private String nombre;
    private String materia;
    
    public Formulas(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("cuantos estudiante quieres evaluar"));
        for (int i = 0; i < n; i++) {
            datosEstudiante();
        }
        
    }
    
    public void datosEstudiante(){
        nombre=JOptionPane.showInputDialog("ingrese el nombre del estudiante");
        materia=JOptionPane.showInputDialog("ingrese la materia");
        double nota1 = numeroNotas();
        double nota2 = numeroNotas();
        double nota3 = numeroNotas();
        promedioNotas(nota1,nota2,nota3);
    }
    
    public double numeroNotas() {
        double notas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota:"));

        while (notas < 0 || notas > 6) {
            notas = Double.parseDouble(JOptionPane.showInputDialog("Nota inválida. Ingrese una nota entre 0 y 6:"));
        }

        return notas;
    }
    
    public void promedioNotas(double nota1,double nota2,double nota3 ){
      double sumaNotas = nota1+nota2+nota3; 
      double promedio =sumaNotas/3;
      validarPromedio(promedio);
    }
    
    public void validarPromedio(double prom) {
        if (prom >= 3.5 && prom <= 5) { 
            System.out.println("---------------------------------");
            System.out.println(nombre+"Ganó la materia con un promedio de " + prom);
            System.out.println("---------------------------------");
        } else {
            System.out.println("---------------------------------");
            System.out.println(nombre+"Perdió la materia con un promedio de " + prom);
            System.out.println("---------------------------------");
            validarRecuperacion(prom);
        }
    }
    
    public void validarRecuperacion(double recuperacion) {
    if (recuperacion >= 2.5 && recuperacion <= 3.4) {
        System.out.println("Puede recuperar el estudiante " + nombre + " la materia " + materia);
        System.out.println("---------------------------------");
    } else {
        System.out.println("Perdió definitivamente la materia"+ nombre);
        System.out.println("---------------------------------");
    }
  }
}
