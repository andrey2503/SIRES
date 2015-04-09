/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class RegistroPersona {
    
    ArrayList<Persona>listaPersonas=new ArrayList<Persona>();
    
    
    public String agregarUsuario(Persona persona,String cedula)
    {
    if(persona!=null)
    {
    if(verificarCedula(cedula)){    
    listaPersonas.add(persona);
    return "Agregado exitoso";
    }// if verificar cedula
    }
    return "Ya existe un registro de la persona";
    }// fin de agregar usuario
    
    public boolean  verificarCedula(String cedula)
    {
    if(listaPersonas.size()!=0)
    {
    for(Persona per:listaPersonas)
    {
    if(per.getCedula().equalsIgnoreCase(cedula))
    {
    return false;
    }
    
    }// ciclo
    }
    return true;
    }// fin de veridicar cedula
    
    
    public String [][] reporte(String cedula)
    {
     String matriz[][]=new String[listaPersonas.size()][Persona.canAtributos()];
     ArrayList<Persona>temporal=new ArrayList<Persona>();
     for(Persona per:listaPersonas)
     {
     if(per.getCedula().equalsIgnoreCase(cedula))
     {
     temporal.add(per);
     }
     }
     String matrizz[][]=new String[temporal.size()][Persona.canAtributos()];
     for(int fila=0;fila <matrizz.length;fila++)
     {
     for(int columna =0;columna< matrizz[fila].length;columna++)
     {
       matrizz[fila][columna]=temporal.get(fila).atributo(columna);
     }
     
     }
    return matrizz;
    }
    
    
    
}
