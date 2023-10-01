package challenge_29;

/*
Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest)
 element from the unsorted portion of the list and moving it to the sorted portion of the list.
 */

public class SelectionSort {

    public static void sort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}