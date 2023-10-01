package challenge_29;

/*
QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and
partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.

The key process in quickSort is a partition(). The target of partitions is to place the pivot
(any element can be chosen to be a pivot) at its correct position in the sorted array and put all smaller elements
 to the left of the pivot, and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed in its correct
position and this finally sorts the array.

Advantages of Quick Sort:
It is a divide-and-conquer algorithm that makes it easier to solve problems.
It is efficient on large data sets.
It has a low overhead, as it only requires a small amount of memory to function.
Disadvantages of Quick Sort:
It has a worst-case time complexity of O(N2), which occurs when the pivot is chosen poorly.
It is not a good choice for small data sets.
It is not a stable sort, meaning that if two elements have the same key, their relative order will not be
preserved in the sorted output in case of quick sort, because here we are swapping elements according to the
pivot’s position (without considering their original positions).

*/


import java.util.Stack;


public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        Stack<Integer> stack = new Stack<>();
        stack.push(low);
        stack.push(high);

        while (!stack.isEmpty()) {
            high = stack.pop();
            low = stack.pop();

            if (low < high) {
                int pivotIndex = partition(arr, low, high);

                stack.push(low);
                stack.push(pivotIndex - 1);

                stack.push(pivotIndex + 1);
                stack.push(high);
            }
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
