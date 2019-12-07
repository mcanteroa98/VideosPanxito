/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosRetornoDeValores;

/**
 *
 * @author bataparato
 */
public class mainOperacion {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        int suma = op.sumar(5,4);
        System.out.println("La suma es " + suma);
    }
}
