/*
Crea un array donde se escriba por teclado el numero de personas que habra en una clase y
que se escriban las notas de cada uno. Calcula la media, el numero de alumnos aprobados y suspendidos
 */
package repasoArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex3 {
    public static void main(String[] args) {
        int nAlumnos, numap = 0, numsus = 0;
        double nota, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay en clase ?");
        nAlumnos = sc.nextInt();        
        int [] array = new int[nAlumnos];
        
        for (int i = 0; i< array.length; i++){
            System.out.println("Introduce la nota del alumno " + (i+1) +":");
            nota = sc.nextDouble();
            
            if (nota < 0 || nota > 10){
                System.out.println("La nota tiene que ser entre el 1 y el 10");
                i--;
            }
            
            if (nota <=4.99 && nota > 0){
                numsus++;
                suma += nota;
            }
            if (nota >=5 && nota <=10){
                numap++;
                suma += nota;
            }
        }
        System.out.println("Han suspendido: " + numsus);
        System.out.println("Han aprobado: " + numap);
        System.out.println("La nota media es: " + (suma/nAlumnos));
    }
}
