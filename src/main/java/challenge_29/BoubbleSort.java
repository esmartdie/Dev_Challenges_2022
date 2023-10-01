package challenge_29;

/*
In this algorithm,

traverse from left and compare adjacent elements and the higher one is placed at right side.
In this way, the largest element is moved to the rightmost end at first.
This process is then continued to find the second largest and place it and so on until the data is sorted.

Advantages of Bubble Sort:
Bubble sort is easy to understand and implement.
It does not require any additional memory space.
It is a stable sorting algorithm, meaning that elements with the same key value maintain their
relative order in the sorted output.

Disadvantages of Bubble Sort:
Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.
Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison
operator to determine the relative order of elements in the input data set. It can limit the
efficiency of the algorithm in certain cases.
 */

public class BoubbleSort {

    public static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    swapped = isSwapped(arr, j);
                }
            }
            if (swapped == false)
                break;
        }
    }

    private static boolean isSwapped(int[] arr, int j) {
        int temp;
        boolean swapped;
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        swapped = true;
        return swapped;
    }
}
