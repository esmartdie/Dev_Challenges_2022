package challenge_29;

import java.util.Arrays;

/*
 * Crea una función que ordene y retorne una matriz de números.
 * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
 *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
 *   o de mayor a menor.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
 *   automáticamente.
 */
public class SortingAlgorithmsImp {

    public static void main(String[] args) {

        int arrayInt[] = new int [] {1, 10, 22, 4, 75, 64, 34, 07, 89, 43};

        orderingArray(arrayInt, "asc");
        System.out.println(Arrays.toString(arrayInt));


        int arrayInt2[] = new int [] {1, 10, 22, 4, 75, 64, 34, 07, 89, 43};

        orderingArray(arrayInt2, "desc");
        System.out.println(Arrays.toString(arrayInt2));


    }

    public static void orderingArray(int arrayInt[], String order) {

        InsertionSortOrdering.insertionSort(arrayInt);

        if (order.equals("desc")) {
            int[] reversedArray = new int[arrayInt.length];

            for (int i = 0; i < arrayInt.length; i++) {
                reversedArray[i] = arrayInt[arrayInt.length - 1 - i];
            }

            System.arraycopy(reversedArray, 0, arrayInt, 0, reversedArray.length);
        }
    }
}
