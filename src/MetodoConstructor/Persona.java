/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoConstructor;

/**
 *
 * @author bataparato
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Metodos
    
    //El metodo constructor es el unico que no necesita un retorno ni void
    public Persona(String nombre, int edad){ 
        this.nombre = nombre;
        this.edad = edad;
    }
    /* El this. se utiliza para que el programa no tenga problema para identificar dos variables con el mismo nombre, en caso contrario se deberà poner nombres distintos y funciona igual
    public Persona(String _nombre, int _edad){ 
        nombre = _nombre;
        edad = _edad;
    */
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
