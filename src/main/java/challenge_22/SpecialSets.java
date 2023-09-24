package challenge_22;

import java.util.*;

/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class SpecialSets {

    public static String[] makeSpecialSet(String[] array1, String[] array2, boolean condition){

        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));
        Set<String> commonElements = new HashSet<>();
        Set<String> nonCommonElements = new HashSet<>();

        elementsSelector(set1, set2, commonElements, nonCommonElements);
        elementsSelector(set2, set1, commonElements, nonCommonElements);

        if (condition){
            return commonElements.toArray(new String[0]);
        }else
            return nonCommonElements.toArray(new String[0]);

    }

    private static void elementsSelector(Set<String> set1, Set<String> set2, Set<String> commonElements,
                                         Set<String> nonCommonElements) {
        for (String element : set2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
            else {
                nonCommonElements.add(element);
            }
        }
    }
}
