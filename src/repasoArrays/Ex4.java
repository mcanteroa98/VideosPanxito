/*
 Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
 */
package repasoArrays;

/**
 *
 * @author bataparato
 */
public class Ex4 {
    public static void main(String[] args) {
        int [] array = new int [100];
        int n = 0, suma = 0;
        
        for (int i = 1; i<array.length; i++){
            suma += i;
            if (i<=array.length) {
                n = i;
            }
        }
        System.out.println("La suma de todos los num es " + suma);
        System.out.println("Y la media " + suma/n );
    }
}
