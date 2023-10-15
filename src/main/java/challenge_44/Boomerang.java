package challenge_44;
/*
 * Enunciado: Crea una función que retorne el número total de bumeranes de
 * un array de números enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
 *   seguidos, en el que el primero y el último son iguales, y el segundo
 *   es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2]
 *   y [4, 2, 4]).
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Boomerang {

    public List<Integer> detectBoomerang(int[] numArray){

        List<Integer> boomerangs = new ArrayList<>();
        int currentNumber = 0;
        int previousNumber = 0;
        int nextNumber = 0;

        for (int i=1; i<=numArray.length-1; i++){
            if (i+1<numArray.length){
                previousNumber = numArray[i-1];
                currentNumber = numArray[i];
                nextNumber = numArray[i+1];

                if (previousNumber == nextNumber && currentNumber != previousNumber){
                    boomerangs.add(previousNumber);
                    boomerangs.add(currentNumber);
                    boomerangs.add(nextNumber);
                }
            }
        }

        return boomerangs;
    }
}
