/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrecargaDeMetodos;

/**
 *
 * @author bataparato
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos
    //Para generar el constructor automaticamente click derecho sobre la linea vacia, insert code, constructor, marcamos las variables.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // La sobrecarga de constructores es cuando hay mas de un constructor
    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    //La sobrecarga de metodos es cunado hay dos o mas con el mismo nombre cambiado la variable que le paso por parametro 
    public void correr(int km){
        System.out.println("He corrido "+km+ " km");
    }
}
