/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosRetornoDeValores;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class mainejOperacion {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        a = sc.nextInt();
        System.out.println("Introduce otro numero ");
        b = sc.nextInt();
        
        ejOperacion op2 = new ejOperacion();
        
        System.out.println("La division es " + op2.dividir(a, b)); //Tambien se puede mostrar el resultado directamente
        int suma1 = op2.sumar1(a, b);
        int resta = op2.restar(a, b);
        int mult = op2.multiplicar(a, b);
        
        
        op2.mostrarResultados(suma1, resta, mult);
    }
}
