/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-arrays-de-java/
Crea un array de 5 posiciones de números
Muestra por consola el indice y el valor al que corresponde.
 */
package repasoArrays;

/**
 *
 * @author bataparato
 */
public class Ex1 {
    public static void main(String[] args) {
        int [] array = {5,7,9,10,33};
        
        for (int i = 0; i < array.length; i++){
            System.out.println("En la posicion "+i+" esta el numero " + array[i]);
        }
    }
}
