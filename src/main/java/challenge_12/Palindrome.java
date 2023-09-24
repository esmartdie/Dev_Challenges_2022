package challenge_12;

import java.text.Normalizer;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
public class Palindrome {

    public static boolean isItAPalindrome(String text){

        String normalizeText = normalizeText(text);
        StringBuilder reverseText = new StringBuilder();

        for(int i=normalizeText.length()-1; i>=0; i--){

            reverseText.append(normalizeText.charAt(i));

        }

        return normalizeText.equals(reverseText.toString().trim());

    }

    private static String normalizeText(String text) {
        String regex = "[^a-zA-Z0-9]";
        String decomposed = Normalizer.normalize(text.toLowerCase(), Normalizer.Form.NFD);
        return decomposed.replaceAll("\\p{M}", "").replaceAll(regex,"")
                .replaceAll(" ", "");
    }
}
