package challenge_14;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

import java.util.ArrayList;

public class NarcissistNumber {

    public static boolean isAnArmstrongNumbert(int number){

        int armstrongResult = 0;
        int digits = countDigits(number);

        ArrayList<Character> intsPositions = intToStringA(number);

        ArrayList<Integer> partialResults = powOfPositions(intsPositions, digits);

        for (Integer partialResult : partialResults) {

            armstrongResult += partialResult;

        }

        return armstrongResult==number;
    }

    private static int countDigits(int number) {
        String numberString = String.valueOf(number);
        return numberString.length();
    }

    private static ArrayList<Character> intToStringA (int n){
        String numberString = String.valueOf(n);
        ArrayList <Character> temporalArrayNumbers = new ArrayList<>();

        for(int i=0; i < numberString.length(); i++){

            temporalArrayNumbers.add(numberString.charAt(i));
        }

        return temporalArrayNumbers;
    }

    private static ArrayList <Integer> powOfPositions (ArrayList <Character> positions, int baseOfPow){

        ArrayList<Integer> partialResults = new ArrayList<>();

        for (Character character : positions) {

            int position = Character.getNumericValue(character);
            int pow = (int) Math.pow(position, baseOfPow);
            partialResults.add(pow);

        }

        return partialResults;
    }
}
