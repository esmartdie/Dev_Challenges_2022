package challenge_29;

/*
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.

To sort an array of size N in ascending order iterate over the array and compare the current element (key)
to its predecessor, if the key element is smaller than its predecessor, compare it to the elements before.
Move the greater elements one position up to make space for the swapped element.

https://www.geeksforgeeks.org/insertion-sort/
 */
public class InsertionSortOrdering {

    public static void insertionSort (int array[]){

        for (int i=0; i< array.length; i++){

            int aux = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = aux;
        }
    }
}
