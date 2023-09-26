package challenge_27;

/*
 * Crea un programa que determine si dos vectores son ortogonales.
 * - Los dos array deben tener la misma longitud.
 * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
 */

import java.util.ArrayList;

public class OrthogonalVectors {

    public boolean areOrthogonal(int[] array1, int [] array2){

        if (array1.length != array2.length) {
            System.out.println("The vectors must have the same length");
            return false;
        }
        int arraySum = 0;
        for (int i = 0; i < array1.length; i++) {
            arraySum += array1[i] * array2[i];
        }
        return arraySum == 0;
    }

}
