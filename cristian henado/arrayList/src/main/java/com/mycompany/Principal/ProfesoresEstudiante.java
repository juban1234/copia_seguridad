/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfesoresEstudiante {
    ArrayList<String> listaProfesores;
    ArrayList<String> listaEstudiantes;
    ArrayList<ArrayList<String>>listaGeneralEstudiantes;
    
    public ProfesoresEstudiante(){
        listaProfesores=new ArrayList<>();
        listaGeneralEstudiantes=new ArrayList<>();
    }
    
    public void iniciar(){
        registrarProfesores();
        modulo();
    }

    private void modulo() {
        
        String menuModulo= "menu del sistema\n";
        menuModulo+="(1) Registrar profesores. ";
        menuModulo+="(2) Registrar estudiantes asociados al profesor.";
        menuModulo+="(3)Consultar lista total de profesores y sus estudiantes asociados.\n";
        menuModulo+="(4)Consultar un profesor e imprimir la lista de estudiantes asociados\n";
        menuModulo+="(5)Consultar un profesor e indicar la cantidad de estudiantes asociados.\n";
        menuModulo+="(6)Consultar un estudiante e indicar cual es su director de grupo.\n ";
        
        int modulo;
        do{
            modulo = Integer.parseInt(JOptionPane.showInputDialog(menuModulo));
        switch (modulo) {
            case 1-> registrarProfesores();
            case 3 -> consultarListaprofesoresYestudiantes();
            case 4 -> consultaProfesorPorNombre();
            case 5 -> consultaCantidadEstudiantesPorProfesor();
            case 6 ->consultaEstudiante();
            case 7 ->System.out.println("gracias por partisipar");
        default -> System.out.println("No existe la opcion");
        }
        } while (modulo != 7);
    }
    
    private void registrarProfesores() {
        System.out.println("\n<<<< Registro de profesores >>>>");
        int cant= Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de profesores"));
        for (int i = 0; i < cant; i++) {
            String nombreProfesor=JOptionPane.showInputDialog("nombre profesor "+(i+1));
            
            while (listaProfesores.contains(nombreProfesor)) {
                JOptionPane.showMessageDialog(null, "El nombre del profesor ya existe. Por favor ingresa otro.");
                nombreProfesor = JOptionPane.showInputDialog("Nombre del profesor " + (i + 1));
            }
            
            listaProfesores.add(nombreProfesor);
        }
        System.out.println("registro de profesor Exitoso!\n");
        registrarEstudiantes();
    }

    private void registrarEstudiantes() {
    System.out.println("\n<<<< Registro de Estudiantes >>>>");
    
    
    for (int i = 0; i < listaProfesores.size(); i++) {
        if (i < listaGeneralEstudiantes.size() && !listaGeneralEstudiantes.get(i).isEmpty()) {
            continue;
        }
        
        JOptionPane.showMessageDialog(null, "Ingrese los estudiantes para el profesor " + listaProfesores.get(i));
        
        
        ArrayList<String> listaEstudiantes = new ArrayList<>();
        
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de estudiantes"));
        for (int j = 0; j < cant; j++) {
            String nombreEst = JOptionPane.showInputDialog("Nombre estudiante " + (j + 1));
            
            while (listaEstudiantes.contains(nombreEst)) {
                JOptionPane.showMessageDialog(null, "El nombre del estudiante ya existe. Por favor ingresa otro.");
                nombreEst = JOptionPane.showInputDialog("Nombre del estudiante " + (j + 1));
            }
            
            listaEstudiantes.add(nombreEst);
        }
        
        // Asegurarse de que se agregue sólo si hay estudiantes
        if (!listaEstudiantes.isEmpty()) {
            if (i < listaGeneralEstudiantes.size()) {
                listaGeneralEstudiantes.set(i, listaEstudiantes);
            } else {
                listaGeneralEstudiantes.add(listaEstudiantes);
            }
        }
    }
    System.out.println("Registro de estudiantes exitoso!\n");
}



    private void consultarListaprofesoresYestudiantes() {
        System.out.println("\n<<<< lista de profesores y estudiantes >>>>");
        ArrayList<String> listaTemporal;
        for (int i = 0; i < listaGeneralEstudiantes.size(); i++) {
            listaTemporal=listaGeneralEstudiantes.get(i);
            System.out.println("profesor: "+listaProfesores.get(i)+" = ");
            System.out.println("[");
            
            for (int j = 0; j < listaTemporal.size(); j++) {
                System.out.println(listaTemporal.get(j));
                if (j<listaTemporal.size()-1) {
                    System.out.println(",");
                }
            }
            System.out.println("]\n");
        }
    }

    private void consultaProfesorPorNombre() {
        System.out.println("\n<<<< consulta profesor >>>>\n");
        String nombre =JOptionPane.showInputDialog("ingresa el nombre del profesor");
        if (listaProfesores.contains(nombre)) {
            int posicion=listaProfesores.indexOf(nombre);
            ArrayList<String> listaEstudianteTemporale=listaGeneralEstudiantes.get(posicion);
            
            System.out.println("profesor: "+nombre+" - ");
            System.out.println("[");
            
            for (int j = 0; j < listaEstudianteTemporale.size(); j++) {
                System.out.println(listaEstudianteTemporale.get(j));
                if (j<listaEstudianteTemporale.size()-1) {
                    System.out.println(",");
                }
            }
            System.out.println("]\n");
        }else{
            System.out.println("No se encontro el profesor "+nombre+"\n");
        }
    }

    private void consultaCantidadEstudiantesPorProfesor() {
        System.out.println("\n<<<< consulta cantidad de estudiantes de profesores\n >>>>");
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del profesor para saber"+" la contidad de estudiantes asociados");
        
        if (listaProfesores.contains(nombre)) {
            int posicion=listaProfesores.indexOf(nombre);
            ArrayList<String> listaEstudianteTemporal=listaGeneralEstudiantes.get(posicion);
            System.out.println("la cantidad de estudiantes asociados al profesor "+nombre+""+" es "+listaEstudianteTemporal.size());
        } else {
            System.out.println("no encuentro el profesor "+nombre+"\n");
        }
    }

    private void consultaEstudiante() {
       System.out.println("\n<<<< consulta de estudiante\n >>>>");
       ArrayList<String>listTemporal;
       
       String nombre = JOptionPane.showInputDialog("ingrese el nombre del estudiante a consultar");
       
        for (int i = 0; i < listaGeneralEstudiantes.size(); i++) {
            listTemporal=listaGeneralEstudiantes.get(i);
            if (listTemporal.contains(nombre)) {
                for (int j = 0; j < listTemporal.size(); j++) {
                    if (listTemporal.get(j).equalsIgnoreCase(nombre)) {
                        System.out.println("encuentra el nombre: "+nombre+" pertenece al"+" grupo de "+listaProfesores.get(i));
                    }
                }
            } else {
                System.out.println("no se encuentra el nombre del grupo de "+listaProfesores.get(i));
            }
        }
    }


}

