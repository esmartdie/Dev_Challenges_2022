package challenge_38;

/*
 * Enunciado: Crea un programa se encargue de transformar un número binario
 * a decimal sin utilizar funciones propias del lenguaje que
 * lo hagan directamente.
 */

public class BinaryToDecimal {

    public static int binaryToDecimal(int binaryNumber){

        char[] binaryChar = reverseAndValidateBinary(binaryNumber);
        int [] decimalArray= new int[binaryChar.length];
        int exponential = 0;
        int decimal = 0;

        for (int i = 0; i<=binaryChar.length -1; i++) {
            decimalArray[i] = (binaryChar[i] - '0') * (int) Math.pow(2, exponential);
            exponential++;
        }

        for (int digits : decimalArray){
            decimal += digits;
        }

        return decimal;
    }

    private static char[] reverseAndValidateBinary(int binaryNumber){

        String inputAsChain = String.valueOf(binaryNumber);
        char[] digits = new char[inputAsChain.length()];
        int digitsPosition = 0;

        for (int i = inputAsChain.length()-1; i >= 0; i--) {
            char currentChar = inputAsChain.charAt(i);
            if (currentChar == '0' || currentChar == '1') {
                digits[digitsPosition] = currentChar;
                digitsPosition++;
            } else {
                throw new IllegalArgumentException("Each digit must be a 0 or a 1");
            }
        }

        return digits;
    }
}

