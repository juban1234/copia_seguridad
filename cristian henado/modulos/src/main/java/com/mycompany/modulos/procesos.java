/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulos;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class procesos {
    int num1;
    int num2;
    
    public void iniciar(){
        modulos();
    }

        static int numeros() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        return num;
    }
    
    private void modulos() {
        int select = Integer.parseInt(JOptionPane.showInputDialog("eliga un modulo"));
        num1 = numeros();
        num2 = numeros();
        switch (select) {
            case 1:
                Sumar();
                iniciar();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void Sumar() {
        int suma = num1+num2;
        System.out.println("la suma de "+num1+" y  "+num2+" es "+suma);
       
        
    }

}
