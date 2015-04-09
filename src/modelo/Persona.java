/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre;
    private String cedula;
    private String estatura;
    private int peso;
    private String fechaIngreso;
    private int montoPagado;
    
     private int dia;
    private int mes;
    private int año;
   public static String []etiquetas={"Fecha","Monto"};
    public Persona(String nombre, String cedula, String estatura, int peso, String fechaIngreso, int montoPagado,int dia,int mes,int año) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estatura = estatura;
        this.peso = peso;
        this.fechaIngreso = fechaIngreso;
        this.montoPagado = montoPagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }
    
    
    public static int canAtributos()
    {return etiquetas.length;}
    
    public String atributo(int numero)
    {
    switch(numero)
    {
        case 0:
            return ""+dia+" "+mes+""+año;
        case 1:
            return ""+montoPagado;
    
        default:
    }
    return null;
    }
    
}
