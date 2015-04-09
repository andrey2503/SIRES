/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.RegistroPersona;
import vista.GUIPagos;
import vista.GUIRegistro;
import vista.GUIReporte;
import vista.GUIVentana;
import vista.PanelPagos;

/**
 *
 * @author usuario
 */
public class ControlGym implements ActionListener{
    private RegistroPersona registroPer;
    private GUIRegistro guiregistro;
    private GUIPagos pago;
    private GUIReporte guireporte;
    public ControlGym(RegistroPersona registroPer) {
        this.registroPer=registroPer;    
    }


    public void actionPerformed(ActionEvent e) {
       
        if(e.getActionCommand().equalsIgnoreCase(GUIVentana.MI_REGISTRO))
        {
        guiregistro= new GUIRegistro(this);
        guiregistro.setVisible(true);
       
        }//registro
        
        if(e.getActionCommand().equalsIgnoreCase(GUIVentana.MI_ATRASOS))
        {
        
        }//atrasos
        
         if(e.getActionCommand().equalsIgnoreCase(GUIVentana.MI_PAGOS))
        {
        pago = new GUIPagos(this);
        pago.setVisible(true);
        }//pagos
         
         if(e.getActionCommand().equalsIgnoreCase(GUIVentana.MI_REPORTES))
        {
        guireporte = new GUIReporte(this);
        guireporte.setVisible(true);
        }//reportes
        if(e.getActionCommand().equalsIgnoreCase(GUIVentana.MI_SALIR))
        {
            System.exit(0);
        }//salir
        ////Fin del guiVenta 
         if(e.getActionCommand().equalsIgnoreCase(GUIRegistro.BTN_AGREGAR))
        {
           
          if((!guiregistro.getcedula().equalsIgnoreCase("") 
                  && !guiregistro.getnombre().equalsIgnoreCase(""))
                  &&guiregistro.getpeso()!=0
                  &&!guiregistro.getestatura().equalsIgnoreCase("")
                  &&guiregistro.getpago()!=0
                  &&!guiregistro.getfecha().equalsIgnoreCase(""))                                                         
          {
             
           Persona persona=new Persona(guiregistro.getnombre(),guiregistro.getcedula(),guiregistro.getestatura(),guiregistro.getpeso(),guiregistro.getfecha(),guiregistro.getpago(),guiregistro.getdia(),guiregistro.getmes(),guiregistro.getaño());
           GUIVentana.mensaje(registroPer.agregarUsuario(persona,guiregistro.getcedula()));
              guiregistro.limpiar();
          }
          else{
          
              GUIVentana.mensaje("Faltan datos");
          }
        }
        
       if(e.getActionCommand().equalsIgnoreCase(GUIReporte.BTN_BUSCAR))
        {
            if(!guireporte.getCedula().equalsIgnoreCase(""))
            {guireporte.setValores(registroPer.reporte(guireporte.getCedula()), Persona.etiquetas);
            }
        
        }
       
        if(e.getActionCommand().equalsIgnoreCase(GUIReporte.BTN_SALIRREPORTE))
        {
        guireporte.dispose();
        }
        
        if(e.getActionCommand().equalsIgnoreCase(PanelPagos.BTN_CANCELARPAGO))
        {pago.dispose();}
        
        if(e.getActionCommand().equalsIgnoreCase(PanelPagos.BTN_PAGARMENSUALIDAD))
        {}
        
        
    }// FIN DEL ACTIONPERFORMED
    
}
