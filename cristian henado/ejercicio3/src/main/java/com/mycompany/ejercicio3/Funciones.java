/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;


public class Funciones {

    private final int semillaChonto = 15;
    private final int semillaEnsalada = 20;
    private final int semillaRepollo = 10;
    private final int semillaCriolla = 8;
    private final int semillaPastusa = 9;
    private final int semillaSalenuna= 11;
    private final int semillalarga = 15;
    private final int semillahuevo = 13;
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

        int opc;
        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

            switch (opc) {
                case 1 -> Tomate();
                case 2 -> Repollo();
                case 3 -> Papa();
                case 4 -> Cebolla();
                case 5 -> JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                default -> System.out.println("No existe la opcion");
            }
        } while (opc != 5);
    }

    private void Tomate() {
        
        String menuTomate="que tipo de tomate quieres\n";
        menuTomate+="1. chonto\n";
        menuTomate+="2. ensalada\n";
        
        int tipo;
        
        do {         
            tipo= Integer.parseInt(JOptionPane.showInputDialog(menuTomate));
            switch (tipo) {
            case 1 -> {
                precioTotal=semillaChonto*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            case 2 -> {
                precioTotal=semillaEnsalada*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            default -> System.out.println("No existe la opcion");
           }
        } while (tipo !=2);
    }
    
    private void Repollo() {
        precioTotal=semillaRepollo*cantidad();
        System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
    }
    
    private void Papa() {
        String menuPapa="que tipo de semilla de papa quieres\n";
        menuPapa+="1. semilla de papa criolla\n";
        menuPapa+="2. semilla de papa past usa\n";
        menuPapa+="3. semilla de papa Salenuna ";
        
        int tipoPapa;
        
        do {          
            tipoPapa=Integer.parseInt(JOptionPane.showInputDialog(menuPapa));
            switch (tipoPapa) {
            case 1 -> {
                precioTotal=semillaCriolla*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            case 2 -> {
                precioTotal=semillaPastusa*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            case 3 -> {
                precioTotal=semillaSalenuna*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            default -> System.out.println("No existe la opcion");
          }
        } while (tipoPapa !=3);
    }
    
    private void Cebolla() {
        String menuCebolla="que tipo de semilla de papa quieres\n";
        menuCebolla+="1. semilla de cebolla larga\n";
        menuCebolla+="2. semilla de cebolla de huevo\n";
        
        int tipoCebolla;
        do {            
            tipoCebolla = Integer.parseInt(JOptionPane.showInputDialog(menuCebolla));
            switch (tipoCebolla) {
            case 1 -> {
                precioTotal=semillalarga*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            case 2 -> {
                precioTotal=semillahuevo*cantidad();
                System.out.println("el precio total a pagar por "+cantidadSemilla+" semillas es "+precioTotal);
            }
            default -> System.out.println("No existe la opcion");
          }
        } while (tipoCebolla !=2);

    }
    
    private int cantidad(){
        cantidadSemilla = Integer.parseInt(JOptionPane.showInputDialog("cuantas semillas quieres"));
        return cantidadSemilla;
    }
}
    
 
