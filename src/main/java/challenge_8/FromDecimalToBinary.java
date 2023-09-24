package challenge_8;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

import java.util.ArrayList;
import java.util.Collections;

public class FromDecimalToBinary {

    public static int buildBinaryNumber(int decimal){

        ArrayList<Integer> binaryArray = new ArrayList<>();
        while (decimal !=0){

            int reminder = decimal % 2;

            decimal /=2;

            binaryArray.add(reminder);

        }

        Collections.reverse(binaryArray);

        int binaryNumber = 0;

        for (Integer digit : binaryArray) {
            binaryNumber = binaryNumber * 10 + digit;
        }

        return binaryNumber;
    }

}
