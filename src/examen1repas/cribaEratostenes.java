/*
La criba de Eratóstenes es un algoritmo que permite hallar todos los [[números primos] menores que un número natural dado n.
Se forma una tabla con todos los números naturales comprendidos entre 2 y n, y se van tachando los números que no son primos de la siguiente manera:
Comenzando por el 2, se tachan todos sus múltiplos; comenzando de nuevo, cuando se encuentra un [[número. 
 */
package examen1repas;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class cribaEratostenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce el numero que quieres saber si es primo");
        n = sc.nextInt();
        for (int i = 2; i<n; i++){
            if (n%i==0){
                System.out.println("No es primo");
            }else{
                System.out.println("Es primo");
            }
        }
    }
}
