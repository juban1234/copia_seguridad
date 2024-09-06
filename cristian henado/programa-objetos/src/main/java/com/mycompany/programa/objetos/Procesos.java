/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa.objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Procesos {
 
    final double por_descuento=0.5;
    String nombre;
    String producto;
    
    public Procesos(){
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad debeses"));
        
        for (int i = 0; i < n; i++) {
            ingresarDatos();
        }
        
        
    }
    
    public void calcularDescuentos(double valorpago){
        double desc=0;
        double valorPagofinal=0;
        if (valorpago>=100000) {
            desc=valorpago*por_descuento;
            valorPagofinal=valorpago-desc;
        }else{
            desc=0;
            valorPagofinal=valorpago;
        }
        imprimirResultado(desc,valorPagofinal);
    }

    public void ingresarDatos() {
         nombre = JOptionPane.showInputDialog("ingrese nombre");
         producto = JOptionPane.showInputDialog("ingrese producto");
        double valorApagar=validarDatos();
        
        calcularDescuentos(valorApagar);
    }
    
    public double validarDatos(){
        double valor = 0;
        do {            
            valor =Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del producto"));
            if (valor < 0) {
            System.out.println("el valor es negativo, repitalo");
            }
        } while (valor<0);
      
        return valor;
    }

    private void imprimirResultado(double desc, double valorPagofinal) {
        String msj="------------------------------------------\n";
        msj ="hola cliente "+nombre+"su producto es: "+producto+"\n";
        msj+="el valor descontado es: "+desc+"\n";
       msj+="el valor a pagar es: "+valorPagofinal+"\n";
       msj+="------------------------------------------";
        System.out.println(msj);
    }
}
