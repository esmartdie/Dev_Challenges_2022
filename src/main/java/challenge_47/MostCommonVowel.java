package challenge_47;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Enunciado: Crea un función que reciba un texto y retorne la vocal que
 * más veces se repita.
 * - Ten cuidado con algunos casos especiales.
 * - Si no hay vocales podrá devolver vacío.
 */
public class MostCommonVowel {

    public char calculateMostCommonVowel(String text) {

        String normalized = Normalizer.normalize(text.toLowerCase(), Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("[\\p{InCombiningDiacriticalMarks}]+");
        String transformedText = pattern.matcher(normalized).replaceAll("");

        Map<Character, Integer> vowelsCount = new HashMap<>();
        vowelsCount.put('a', 0);
        vowelsCount.put('e', 0);
        vowelsCount.put('i', 0);
        vowelsCount.put('o', 0);
        vowelsCount.put('u', 0);

        for (char caracter : transformedText.toCharArray()) {
            if (vowelsCount.containsKey(caracter)) {
                vowelsCount.put(caracter, vowelsCount.get(caracter) + 1);
            }
        }

        char mostCommonVowel = ' ';
        int maxCount = 0;

        for (char vowel : vowelsCount.keySet()) {
            int count = vowelsCount.get(vowel);
            if (count > maxCount) {
                maxCount = count;
                mostCommonVowel = vowel;
            }
        }

        return mostCommonVowel;
    }

}
