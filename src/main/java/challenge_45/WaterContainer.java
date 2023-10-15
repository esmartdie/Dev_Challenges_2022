package challenge_45;

import java.util.ArrayList;
import java.util.List;

public class WaterContainer {

    public int drawWaterContainer(int[] positiveArray) throws NegativeArrayValue {

        for (int i : positiveArray) {
            if (i < 0) {
                throw new NegativeArrayValue("The array contains negative values");
            }
        }

        int waterContains = 0;

        for (int i = 1; i < positiveArray.length - 1; i++) {
            int leftWall = findLeftWall(positiveArray, i);
            int rightWall = findRightWall(positiveArray, i);

            int trappedWater = Math.min(leftWall, rightWall) - positiveArray[i];

            if (trappedWater > 0) {
                waterContains += trappedWater;
            }
        }

        return waterContains;
    }

    private int findLeftWall(int[] positiveArray, int currentIndex) {
        int maxLeft = 0;
        for (int i = 0; i < currentIndex; i++) {
            maxLeft = Math.max(maxLeft, positiveArray[i]);
        }
        return maxLeft;
    }

    private int findRightWall(int[] positiveArray, int currentIndex) {
        int maxRight = 0;
        for (int i = currentIndex + 1; i < positiveArray.length; i++) {
            maxRight = Math.max(maxRight, positiveArray[i]);
        }
        return maxRight;
    }

    public static void main(String[] args) {
        WaterContainer container = new WaterContainer();
        int[] array = {5, 2, 3, 4};
        try {
            int trappedWater = container.drawWaterContainer(array);
            System.out.println("Trapped water: " + trappedWater);
        } catch (NegativeArrayValue e) {
            System.out.println(e.getMessage());
        }
    }
}

class NegativeArrayValue extends Exception {
    public NegativeArrayValue(String message) {
        super(message);
    }
}

