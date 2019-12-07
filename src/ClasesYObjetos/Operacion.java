/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Operacion {
     //Atributos
    int n1;
    int n2;
    int suma;
    int resta;
    
    //Metodos
    
    //Metodo para pedir al usuario 2 numeros
    public void leerNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero 1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce el numero 2: ");
        n2 = sc.nextInt();
    }
    
    //Metodo suma
    public void sumar(){
        suma = n1+n2;
    }
    
    public void restar(){
        resta = n1-n2;
    }
    
    public void mostrarResulatos(){
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
    }

    public void sumar(int n1, int n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
