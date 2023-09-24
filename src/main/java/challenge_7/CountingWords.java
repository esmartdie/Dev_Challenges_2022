package challenge_7;

import java.util.HashMap;
import java.util.Map;

public class CountingWords {

    public static void countingWords(String text){

        String textToLowerCase = text.toLowerCase();

        String cleanText = removeSpecialCharacters(textToLowerCase);

        String[] textToCount = textToLowerCase.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (int i = 0; i<textToCount.length; i++ ){

            int contador = 0;

            for(int j = 0; j<textToCount.length; j++){

                if(textToCount[i].equals(textToCount[j])){
                    contador ++;
                }

            }

            wordCountMap.put(textToCount[i], contador);

        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("The word " + entry.getKey() + " is repeated: " + entry.getValue() + " time/times");
        }
    }

    public static String removeSpecialCharacters(String text) {

        String regex = "[^\\p{L}\\p{N}\\p{M}]";

        return text.replaceAll(regex, "");
    }
}
