/*
    Selection Sort

    Given array of N Items
    1) Find the smallest item min, in the range of [0...n-1]
    2) Swap min with first element i
    3) Increase i by 1 and go to step 1

    Time Complexity: O(n2) as there are two nested loops.
    In Place : Yes, it does not require extra space.

    29,10,14,37,13
    [10],29,14,37,13
    [10,13],14,37,29
    [10,13,14],37,29
    [10,13,14,29,37]
 */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]) {
        int[] array = {29,10,14,37,13};
        System.out.println(Arrays.toString(selectionSort(array)));

    }

    static int[] selectionSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {
            int min = i;
             for (int j = i+1; j < length; j++) {
                if (array[j]  < array[min]) {
                    min = j;
                }
             }
            swap(array, min, i);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
