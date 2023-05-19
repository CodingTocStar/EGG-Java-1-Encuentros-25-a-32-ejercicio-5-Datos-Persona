/*
    Una persona tiene 
    un nombre y 
    una fecha de nacimiento (Tipo Date), 
    constructor vacío,
    constructor parametrizado, 
    get y set.
 */
package Entidades;

import java.util.Date;

/**

 */
public class Persona {
    //atributos
    private String nombre;
    private Date fechaDeNacimiento;
    
    //constructor
    public Persona(){
    }
    
    public Persona(String nombre, Date fechaDeNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    
    //GETTER & SETTER   
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Date getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
}
