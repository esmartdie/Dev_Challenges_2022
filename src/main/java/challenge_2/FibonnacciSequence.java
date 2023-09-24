package challenge_2;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class FibonnacciSequence {
    public static void sequence(int n){

        long previousNumber = 0;
        long previousResult = 0;
        long result = 0;

        for(int i=0; i<=n; i++)
            if( i== 0) {
                System.out.println(result);
            }
            else if (i==1) {
                result = 1;
                System.out.println(result);
            }
            else{
                previousNumber=previousResult;
                previousResult=result;
                result = previousResult + previousNumber;
                System.out.println(result);
            }

    }
}
