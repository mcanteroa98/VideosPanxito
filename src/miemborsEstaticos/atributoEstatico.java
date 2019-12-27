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
public class atributoEstatico {
    //Si ponemos un "static" la clase sera la dueña del atributo
    //El ultimo cambio que se le haga a un objeto será el mismo para todos los objetos
    private static String frase = "Primera frase";
    
    public static void main(String[] args) {
        atributoEstatico ob1 = new atributoEstatico();
        atributoEstatico ob2 = new atributoEstatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }
}
