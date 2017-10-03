/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionded;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author rodo
 */
public class ColaPersonas {
   
    
    private LinkedList<Persona> cola = new LinkedList<>();

    public ColaPersonas() {                
    }
            
    public void agregarAcola (Persona persona){
        this.cola.add(persona);
    }
    
    public String pintar(){
        String alumnos="";
        for (Persona persona : cola) {
           alumnos+="\n-Nombre: "+ persona.getNombre()+" "+persona.getApellido();
        }
        return alumnos;
    }
    
    public void ordenar(){
      Collections.sort(this.cola, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
              return o1.getApellido().compareTo(o2.getApellido());
            }
        });       
    }
    
    public String entregarDiploma(){
      String llamada = "Entregamos el siguiente diploma a "+cola.peek().getNombre()+" "+cola.peek().getApellido();
       cola.poll();
       return llamada;
    }

    
}
