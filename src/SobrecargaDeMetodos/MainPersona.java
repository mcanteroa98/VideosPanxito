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
public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marc",21);
        Persona p2 = new Persona("12153");
        p1.correr();
        p2.correr(100);
        //Java diferencia los metodos por la cantidad de parametros que estos tengan o por el tipo de parametro.
    }
}
