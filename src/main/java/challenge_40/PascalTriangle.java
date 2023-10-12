package challenge_40;

public class PascalTriangle {

    public static void main(String[] args) {
        int sideSize = 4;
        drawEquilateralPascalTriangle(sideSize);
    }

    public static void drawEquilateralPascalTriangle(int sideSize) {
        for (int i = 0; i < sideSize; i++) {

            for (int j = 0; j < sideSize - i; j++) {
                System.out.print(" ");
            }

            int current = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(current + " ");
                current = current * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}