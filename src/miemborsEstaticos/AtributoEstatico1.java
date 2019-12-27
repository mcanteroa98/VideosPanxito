/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miemborsEstaticos;

/**
 *
 * @author bataparato
 */
public class AtributoEstatico1 {
    
    private static String frase = "Primera frase";
    
    public static void main(String[] args) {
        //Al ser estatico y pertenecer a la clase podemos hacer este sout
        System.out.println(AtributoEstatico1.frase);
    }
}
