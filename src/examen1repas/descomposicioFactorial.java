/*
Calcula la descomposicio factorial d'un numero donat
 */
package examen1repas;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class descomposicioFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux, i = 2;
        System.out.println("Introduce un num: ");
        n = sc.nextInt();
        
       while (i!=1){
        if (n%i == 0){
            System.out.println(n + " | " + i);
            n = n/i;
            }else{
                i++;
        }
        
        }
    }
}
