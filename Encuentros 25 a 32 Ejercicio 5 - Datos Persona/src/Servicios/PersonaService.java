package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/*
 */
public class PersonaService {

    Scanner lector = new Scanner(System.in);

    /*a) Método crearPersona que 
    pida al usuario Nombre y 
    fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado*/
    public Persona crearPersona() {
        System.out.print("Ingrese su nombre:");
        String nombre = lector.nextLine();

        System.out.println("Ingrese su fecha de nacimiento.");

        System.out.print("Dia:");
        int dia = lector.nextInt();

        System.out.print("Mes:");
        int mes = lector.nextInt();

        System.out.print("Año:");
        int anio = lector.nextInt();

        Date fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fechaDeNacimiento);
    }

    /*b) Método calcularEdad que 
    calcule la edad del usuario utilizando 
        el atributo de fecha de nacimiento y la fecha actual.*/
    public int calcularEdad(Persona persona) {

        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFechaDeNacimiento();

        //actual
        int diaActual = fechaActual.getDay();
        int mesActual = fechaActual.getMonth();
        int anioActual = fechaActual.getYear();

        //nacimiento
        int diaNacimiento = fechaNacimiento.getDay();
        int mesNacimiento = fechaNacimiento.getMonth();
        int anioNacimiento = fechaNacimiento.getYear();

        //calculos
        int edad = anioActual - anioNacimiento;

        if ((mesActual < mesNacimiento)
                || ((mesActual == mesNacimiento && diaActual < diaNacimiento))) {

            return --edad;

        } else {

            return edad;

        }

    }

    /*c) Método menorQue recibe 
    como parámetro una Persona y una edad.
    Retorna true si la persona es menor que la edad consultada o false
    en caso contrario.*/
    public boolean menorQue(Persona persona) {

        int edadPersona = calcularEdad(persona);

        if (edadPersona < 18) {

            return true;

        } else {
        
            return false;
            
        }
    }
    
    /*d) Método mostrarPersona que 
    muestra la información de la persona deseada.*/

    public void mostrarPersona(Persona persona){
    
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("La fecha de nacimiento es: " + persona.getFechaDeNacimiento());
        System.out.println("La edad es: " + calcularEdad(persona) + " años.");
        System.out.println("Por lo tanto, el test de si la persona es menor de edad dio: " + menorQue(persona));
    }
    
    //=====================================================================================
}
