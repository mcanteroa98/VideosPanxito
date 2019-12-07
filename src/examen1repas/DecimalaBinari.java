/*
Para escribir el programa nos vamos a basar en la forma clásica de pasar de decimal a binario, o sea, dividir el número entre 2 y quedarnos con el resto de la división.
Esta cifra, que será un cero o un uno, es el dígito de menos peso (más a la derecha) del número binario.
A continuación volvemos a dividir el cociente que hemos obtenido entre 2 y nos quedamos con el resto de la división.
Esta cifra será la segunda por la derecha del número binario. Esta operación se repite hasta que obtengamos un cero como cociente.
 */
package examen1repas;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class DecimalaBinari {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, resto, exp, binario;
        System.out.print("Introduce el numero que quieres pasar a binario:");
        n = sc.nextInt();
        
        exp = 0;
        binario = 0;
        while (n!=0){
            resto = n%2;
            binario += resto * Math.pow(10, exp);
            exp++;
            n/=2;
        }
        System.out.println("En binario es: " +binario);
    } 
}
