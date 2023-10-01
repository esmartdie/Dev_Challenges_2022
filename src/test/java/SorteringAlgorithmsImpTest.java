
import challenge_29.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static challenge_29.LargeRandomArray.generateRandomArray;
import static org.junit.Assert.assertArrayEquals;


public class SorteringAlgorithmsImpTest {

    int [] testCase;
    @BeforeClass
        public void defineTestCase(){
            testCase = generateRandomArray(100000);
    }

    @Test
    public void analizeInsertionSort(){

        int [] testCaseJavaUnsorted = testCase;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = testCase;
        long startTime2 = System.nanoTime();
        InsertionSortOrdering.insertionSort(testCaseUnsorted);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time Insertion Sort: " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

    @Test
    public void analizeQuickSort(){

        int [] testCaseJavaUnsorted = testCase;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = testCase;
        int n = testCaseUnsorted.length;
        long startTime2 = System.nanoTime();
        QuickSort.quickSort(testCaseUnsorted,0,n-1);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time QuickSort " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

    @Test
    public void analizeQuickSortUniqueElements(){

        Set<Integer> set = new HashSet<>();
        for (Integer element : testCase) {
            set.add(element);
        }

        Integer[] integerArray = new Integer[set.size()];
        set.toArray(integerArray);

        int[] intArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }


        int [] testCaseJavaUnsorted = intArray;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = intArray;
        int n = testCaseUnsorted.length;
        long startTime2 = System.nanoTime();
        QuickSort.quickSort(testCaseUnsorted,0,n-1);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time QuickSort: " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

    @Test
    public void analizeBoubbleSort(){

        int [] testCaseJavaUnsorted = testCase;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = testCase;
        int n = testCaseUnsorted.length;
        long startTime2 = System.nanoTime();
        BoubbleSort.bubbleSort(testCaseUnsorted, n);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time Bouble Sorte: " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

    @Test
    public void analizeTreeSort(){

        int [] testCaseJavaUnsorted = testCase;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = testCase;
        TreeSort treeSort = new TreeSort();
        long startTime2 = System.nanoTime();
        treeSort.treeSort(testCaseUnsorted);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time Tree Sort: " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

    @Test
    public void analizeSelectionSort(){

        int [] testCaseJavaUnsorted = testCase;
        System.out.println("Test case array size: " + testCaseJavaUnsorted.length + " elements");
        long startTime = System.nanoTime();
        Arrays.sort(testCaseJavaUnsorted);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time Java Array Sort: " + elapsedTime + " nanoseconds or " + (elapsedTime/1000000) + " milliseconds");

        int [] testCaseUnsorted = testCase;
        long startTime2 = System.nanoTime();
        SelectionSort.sort(testCaseUnsorted);
        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Total time Tree Sort: " + elapsedTime2 + " nanoseconds or " + (elapsedTime2/1000000) + " milliseconds");

        assertArrayEquals(testCaseJavaUnsorted, testCaseUnsorted);

    }

}
