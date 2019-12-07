/*
Introdueix un array i que donada una posicio 
intercanvii desde la posicio cap enrrere el numero donat per el mes gran.
 */
package examen1repas;

/**
 *
 * @author bataparato
 */
public class DerrerExExamen {
    public static void main(String[] args) {
        int n=3, y = 0;
        int [] array = {5,7,9,1,10,33};
        
        for (int i = 0; i<array.length; i++){
            if (i==n){
                for (y = n; y<array.length; y--){
                    if (array[y]>array[n]){
                        y = n;
                    }
                }
            }
        }
        System.out.println(y);
    }
}
