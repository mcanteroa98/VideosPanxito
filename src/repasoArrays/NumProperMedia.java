/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoArrays;

/**
 *
 * @author bataparato
 */
public class NumProperMedia {
    public static void main(String[] args) {
        int array [] = {5,1,2,10,6};
        int suma = 0, n=0, nProper = 0;
        double media, diferencia = 1000;
        for (int i = 0; i < array.length; i++){
            suma +=array[i];
            n++;
        }media = suma/n;
        
        for (int i = 0; i < array.length; i++){
            if (array[i]== media){
                nProper = array[i];
            }else
                if(Math.abs(array[i]-media)<diferencia){
                    nProper = array[i];
                    diferencia = Math.abs(array[i]-media);
            }
        }
        System.out.println("La suma dels numeros es "+ suma);
        System.out.println("Hi ha "+n+" numeros");
        System.out.println("La mitja es "+ media);
        System.out.println("El numero mes proper a la mitja es " +nProper);
    }
}
