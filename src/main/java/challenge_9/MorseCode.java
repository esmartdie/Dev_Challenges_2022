package challenge_9;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCode {

    public String textConversor (String text){
        String regex = "[a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find())
            return converseToMorseCode(text);
        else
            return reverseMorseCode(text);

    }

    public String converseToMorseCode(String text) {
        StringBuilder morseCode = new StringBuilder();
        HashMap<String, String> morseAlphabet = createMorseAlphabet();

        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String currentSymbol = Character.toString(currentChar);

            if (currentChar == ' ') {
                morseCode.append(" ");
            } else if (currentSymbol.equals("C") && i < text.length() - 1 && text.charAt(i + 1) == 'H') {
                morseCode.append(morseAlphabet.get("CH"));
                i++;
            } else if (morseAlphabet.containsKey(currentSymbol)) {
                morseCode.append(morseAlphabet.get(currentSymbol));
            }

            if (i < text.length() - 1 && text.charAt(i + 1) != ' ') {
                morseCode.append(" ");
            }
        }

        return morseCode.toString().trim();
    }

    public String reverseMorseCode(String text) {
        StringBuilder reverseMorseCode = new StringBuilder();
        HashMap<String, String> reverseMorseAlphabet = createInverseMorseAlphabet();

        String[] words = text.split("  "); // Separar las palabras por triple espacio

        for (String word : words) {
            String[] morseChars = word.split(" "); // Separar los caracteres por espacio

            for (String morseChar : morseChars) {
                if (reverseMorseAlphabet.containsKey(morseChar)) {
                    reverseMorseCode.append(reverseMorseAlphabet.get(morseChar));
                }
            }

            reverseMorseCode.append(" "); // Agregar un espacio entre palabras
        }

        return reverseMorseCode.toString().trim();

    }



    private HashMap<String, String> createMorseAlphabet() {
        HashMap<String, String> morseAlphabet = new HashMap<>() {{
            put("A", "·—");
            put("B", "—···");
            put("C", "—·—·");
            put("CH", "————");
            put("D", "—··");
            put("E", "·");
            put("F", "··—·");
            put("G", "——·");
            put("H", "····");
            put("I", "··");
            put("J", "·———");
            put("K", "—·—");
            put("L", "·—··");
            put("M", "——");
            put("N", "—·");
            put("Ñ", "——·——");
            put("O", "———");
            put("P", "·——·");
            put("Q", "——·—");
            put("R", "·—·");
            put("S", "···");
            put("T", "—");
            put("U", "··—");
            put("V", "···—");
            put("W", "·——");
            put("X", "—··—");
            put("Y", "—·——");
            put("Z", "——··");
            put("0", "—————");
            put("1", "·————");
            put("2", "··———");
            put("3", "···——");
            put("4", "····—");
            put("5", "·····");
            put("6", "—····");
            put("7", "——···");
            put("8", "———··");
            put("9", "————·");
            put(".", "·—·—·—");
            put(",", "——··——");
            put("?", "··——··");
            put("\"", "·—··—·");
            put("/", "—··—·");
        }};
        return morseAlphabet;
    }

    private HashMap<String, String> createInverseMorseAlphabet() {
        HashMap<String, String> morseAlphabet = createMorseAlphabet();
        HashMap<String, String> inverseMorseAlphabet = new HashMap<>();

        for (Map.Entry<String, String> entry : morseAlphabet.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            inverseMorseAlphabet.put(value, key);
        }

        return inverseMorseAlphabet;
    }
}
