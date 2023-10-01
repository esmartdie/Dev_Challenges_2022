package challenge_29;

import java.util.Random;

public class LargeRandomArray {

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }
}
