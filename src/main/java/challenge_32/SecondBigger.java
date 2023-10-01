package challenge_32;

import java.util.Arrays;

/*
 * Dado un listado de números, encuentra el SEGUNDO más grande.
 */
public class SecondBigger {

    public static void main(String[] args) {

        int [] testCase = new int[] {2, 4, 9, 6, 10, 22, 100, 99, 88, 67, 45, 79};
        int secondBigger = secondBigger(testCase);
        System.out.println(secondBigger);
    }

    public static int secondBigger(int [] array){

        Arrays.sort(array);
        return array[array.length -2];
    }
}
