/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos {

    private ArrayList<String> nombres;
    private ArrayList<Double> notas;

    public Procesos() {
        nombres = new ArrayList<String>();
        notas = new ArrayList<Double>();
        promedio();
        System.out.println("notas: "+notas);
    }

    private void promedio() {
        double validarNotas;
        do {
           validarNotas=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la nota (0 - 5)"));
            if (validarNotas < 0 || validarNotas > 5) {
                System.out.println("El valor es inválido, repítalo");
            }
        } while (validarNotas < 0 || validarNotas > 5);
        notas.add(validarNotas);
        
        
    }

}
