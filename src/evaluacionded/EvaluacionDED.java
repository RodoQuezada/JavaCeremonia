/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionded;

import javax.swing.JOptionPane;

/**
 *
 * @author rodo
 */
public class EvaluacionDED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaPersonas listaPersonas = new ColaPersonas();
        boolean uso = true;

        while (uso) {
            String opcion = JOptionPane.showInputDialog(
                    "\n1. Agregar Alumno "
                    + "\n2. Ordenar Alumnos"
                    + "\n3. Llamar al siguiente"
                    + "\n4. Mostrar Alumnos"
                    +"\n5. Salir"    
            );
            Persona persona = new Persona();
            switch (opcion) {
                case "1":
                    persona.setNombre(JOptionPane.showInputDialog("Ingrese Nombre Alumno: "));
                    persona.setApellido(JOptionPane.showInputDialog("Ingrese Apellido Alumno: "));
                    persona.setSexo(JOptionPane.showInputDialog("Ingrese Sexo Alumno: "));
                    listaPersonas.agregarAcola(persona);
                    JOptionPane.showMessageDialog(null, "Alumno Ingresado");
                    break;
                case "2":
                    listaPersonas.ordenar();
                    JOptionPane.showMessageDialog(null, "Alumnos ordenados por Apellido");
                    listaPersonas.pintar();
                    break;
                case "3":
                   JOptionPane.showMessageDialog(null, listaPersonas.entregarDiploma());  
                   break;
                case "4":
                   JOptionPane.showMessageDialog(null, listaPersonas.pintar());
                   break;
                case "5":
                    uso = false;
                    break;
            }

        }

    }

}
