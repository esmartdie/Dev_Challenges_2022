package challenge_34;

/*
 * Enunciado: Dado un array de enteros ordenado y sin repetidos,
 * crea una función que calcule y retorne todos los que faltan entre
 * el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 */

import java.util.*;

public class LostNumbers {

    public static int[] lostNumbers(int[] arrayInput){

        List<Integer> lostNumberCollection= new ArrayList<Integer>();

        boolean inputControls = inputControl(arrayInput);

        if (!inputControls) {
            throw new IllegalArgumentException("The input array is not correct");
        }

        int minValue = arrayInput[0];
        int maxValue = arrayInput[arrayInput.length-1];
        for (int i = minValue + 1; i < maxValue; i++) {
            boolean found = false;
            for (int element : arrayInput) {
                if (element == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lostNumberCollection.add(i);
            }
        }

        return lostNumberCollection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static boolean inputControl(int[] arrayInput){

        if (arrayInput == null || arrayInput.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int element : arrayInput) {
            set.add(element);
        }

        Integer[] integerArray = new Integer[set.size()];
        set.toArray(integerArray);

        Arrays.sort(integerArray);

        return Arrays.equals(Arrays.stream(arrayInput).boxed().toArray(Integer[]::new), integerArray);
    }
}
