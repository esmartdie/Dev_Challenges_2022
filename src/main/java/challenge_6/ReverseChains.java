package challenge_6;
/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */


public class ReverseChains {

    public static String reverseChains(String originalPhrase){

        char[] reversePhrase = new char[originalPhrase.length()];
        char [] characters = originalPhrase.toCharArray();

        for(int i =originalPhrase.length()-1, j=0; i>=0; i--, j++){

            reversePhrase[j]=characters[i];

        }
        return new String(reversePhrase);
    }
}
