package challenge_30;

/*
 * Crea una función que reciba un texto y muestre cada palabra en una línea,
 * formando un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 */

import java.util.LinkedList;

public class WordFrame {
    public static void main(String[] args) {
        makeWordFrame("Hello World from my room");
    }

    public static void makeWordFrame(String textInput) {
        LinkedList<String> wordsList = new LinkedList<>();
        int textMaxLength = 0;

        String[] words = textInput.split("\\s+");

        for (String word : words) {
            if (word.length() > textMaxLength)
                textMaxLength = word.length() + 7;
            wordsList.add("* " + word);
        }

        addSpaces(wordsList, textMaxLength);
        replaceLastCharWithAsterisk(wordsList);
        addHeaderAndFooter(wordsList, textMaxLength);

        for (String word : wordsList) {
            System.out.println(word);
        }
    }

    private static void addSpaces(LinkedList<String> wordsList, int maxLength) {
        for (int i = 0; i < wordsList.size(); i++) {
            String word = wordsList.get(i);
            if (word.length() < maxLength) {
                int spacesToAdd = maxLength - word.length();
                for (int j = 0; j < spacesToAdd - 1; j++) {
                    word = word + ' ';
                }
                wordsList.set(i, word);
            }
        }
    }

    private static void replaceLastCharWithAsterisk(LinkedList<String> wordsList) {
        for (int i = 0; i < wordsList.size(); i++) {
            String word = wordsList.get(i);
            if (!word.isEmpty()) {
                int lastIndex = word.length() - 1;
                word = word.substring(0, lastIndex) + "*";
                wordsList.set(i, word);
            }
        }
    }

    private static void addHeaderAndFooter(LinkedList<String> wordsList, int size){

        StringBuilder hf = new StringBuilder();
        for(int i=0; i<(size-1);i++){
            hf.append("*");
        }
        wordsList.addFirst(hf.toString());
        wordsList.addLast(hf.toString());
    }
}