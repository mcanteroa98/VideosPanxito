/*
Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9,
al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array
(que tenga como parámetros los números entre los que tenga que generar),
para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios). 
 */
package repasoArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex2 {
    public static void main(String[] args) {
        int n, suma = 0;
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];
        
        for (int i = 0; i<array.length; i++){
            System.out.print("Introduce el valor del indice " + i+": ");
            n = sc.nextInt();
            if (n<0 || n>9){
                System.out.println("Introduce el valor entre el 0 y el 9");
                i--;
            }
            suma += n;
        }
        System.out.println("La suma es " + suma);
    }
}
