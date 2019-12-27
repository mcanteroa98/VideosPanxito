/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class MainCuadrilatero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1, lado2;
        
        System.out.println("Introduce el valor del lado1");
        lado1 = sc.nextFloat();
        System.out.println("Introduce el valor del lado2");
        lado2 = sc.nextFloat();
        
        if (lado1==lado2){
            c1 = new Cuadrilatero(lado1);
        }
        else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());
    }
}
