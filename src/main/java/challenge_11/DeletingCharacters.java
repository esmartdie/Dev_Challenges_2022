package challenge_11;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class DeletingCharacters {

    public static void uniqueCharacters(String str1, String str2) {
        Set<Character> set1 = new LinkedHashSet<>();
        Set<Character> set2 = new LinkedHashSet<>();

        stringToSet(str1, set1);
        stringToSet(str2, set2);

        // Calcular los caracteres únicos en str* que no están en str*
        Set<Character> out1 = new LinkedHashSet<>(set1);
        out1.removeAll(set2);

        Set<Character> out2 = new LinkedHashSet<>(set2);
        out2.removeAll(set1);

        System.out.println("out1: " + setToString(out1));
        System.out.println("out2: " + setToString(out2));
    }

    private static void stringToSet(String str, Set<Character> set) {
        for (char c : str.toCharArray()) {
            set.add(c);
        }
    }

    private static String setToString(Set<Character> set) {
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

}
