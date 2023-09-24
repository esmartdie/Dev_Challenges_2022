package challenge_13;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

public class Factorial {

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
