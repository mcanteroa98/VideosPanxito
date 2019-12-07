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
public class mainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marc",21);
        Persona p2 = new Persona("Juan",20);
        p1.mostrarDatos();
        System.out.println("");
        p2.mostrarDatos();
    }
}
