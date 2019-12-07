/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class MainOperacionParametros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Introduce el numero1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce el numero2: ");
        n2 = sc.nextInt();
        
        OperacionParametros op = new OperacionParametros();
        
        op.sumar(n1,n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        
        op.mostrarResultados();
    }
}
