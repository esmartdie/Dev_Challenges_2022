package challenge_23;

/*
 * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class Gcd_Lcd {
    //GREATEST COMMON DIVISOR AND LOWEST COMMON MULTIPLE

    public static int calculateLCM(int a, int b){

        return (a * b)/calculateGCD(a, b);

    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
