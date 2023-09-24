package challenge_1;

import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class ComprobarAnagrama {

    public static boolean anagramCheck(String wordA, String wordB){

        wordA = wordA.toLowerCase();
        wordB = wordB.toLowerCase();

        char[] arr1 = wordA.toCharArray();
        char[] arr2 = wordB.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(wordA.equals(wordB))
            return false;
        else if(wordA.length()!=wordB.length())
            return false;
        else return Arrays.equals(arr1, arr2);

    }

}

