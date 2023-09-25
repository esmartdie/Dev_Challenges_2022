package challenge_24;

/*
 * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
 * ¿De cuántas maneras eres capaz de hacerlo?
 * Crea el código para cada una de ellas.
 */

import java.util.stream.IntStream;

public class From1To100 {

    public static void main(String[] args) {

        System.out.println("------1 Option------");
        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("------2 Option------");
        int count2=1;
        while(count2<=100){
            System.out.println(count2);
            count2++;
        }

        System.out.println("------3 Option------");
        int count3=1;
        do{
            System.out.println(count3);
            count3++;
        } while(count3<=100);

        System.out.println("------4 Option------");
        IntStream.rangeClosed(1, 100).forEach(System.out::println);

    }

}
