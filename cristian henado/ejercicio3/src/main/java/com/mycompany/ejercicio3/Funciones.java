/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;


public class Funciones {

    private int presioSemilla = 0;
    private int cantidadSemilla; 
    private int precioTotal;
            
    public Funciones() {
        tipoCultivo();
    }

    private void tipoCultivo() {

        String menuPrincipal = "MENU PRINCIPAL\n\n";
        menuPrincipal += "1. TOMATE\n";
        menuPrincipal += "2. REPOLLO\n";
        menuPrincipal += "3. PAPA\n";
        menuPrincipal += "4. CEBOLLA\n";
        menuPrincipal += "5. SALIR\n\n";
        menuPrincipal += "Ingrese una opcion\n";

        int opc = 0;
        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

            switch (opc) {
                case 1:Tomate();
                    break;
                case 2:Repollo();
                    break;
                case 3:Papa(); 
                    break;
                case 4:Cebolla();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("No existe la opcion");
                    break;
            }
        } while (opc != 5);
    }

    private void Tomate() {
        
        String menuTomate="que tipo de tomate quieres\n";
        menuTomate+="1. chonto\n";
        menuTomate+="2. ensalada\n";
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(menuTomate));
            switch (tipo) {
            case 1:
                presioSemilla = 15;
                precioTotal=presioSemilla*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
                
                break;
            case 2:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private void Repollo() {
        System.out.println("holka");
    }
    
    private void Papa() {
        System.out.println("holka");
    }
    
    private void Cebolla() {
        System.out.println("holka");
    }
    
    private int cantidad(){
        cantidadSemilla = Integer.parseInt(JOptionPane.showInputDialog("cuantas semillas quieres"));
        return cantidadSemilla;
    }
}
    
 
