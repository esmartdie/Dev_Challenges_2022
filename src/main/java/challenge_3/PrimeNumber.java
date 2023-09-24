package challenge_3;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

import java.util.ArrayList;

public class PrimeNumber {

    public static void havePrimeNumber(int n){


        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i<=n; i++){
            boolean isPrime = true;

            for(int j = 2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }

        }

        for (int k=0; k<primeNumbers.size();k++) {
            System.out.println(primeNumbers.get(k));
        }
    }
}
