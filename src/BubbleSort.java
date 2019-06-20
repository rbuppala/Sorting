import java.util.Arrays;

/*
    Bubble Sort is the  sorting algorithm that works by repeatedly swapping
    the adjacent elements if they are in wrong order.

    Given an array of N items

    1) Compare pair of adjacent items
    2) Swap if the items are out of order
    3) Repeat until end of the order
        - The largest item will be at the last position
    4) Reduce n by 1 and go to step 1

    29,10,14,37,13
    10,29,14,37,13
    10,14,29,37,13
    10,14,29,37,13
    10,14,29,13,37

    10,14,29,13,[37]
    10,14,29,13,[37]
    10,14,29,13,[37]
    10,14,13,29,[37]

    10,14,13,[29,37]
    10,14,13,[29,37]
    10,13,14,[29,37]

    Time Complexity: O(n2) as there are two nested loops.
    In Place : Yes, it does not require extra space.


 */
public class BubbleSort {

    public static void main(String args[]) {
        int[] array =  {29,10,14,37,13};
        bubbleSort(array);
    }
    /*
        Time Complexity o(n2)
     */
    static int[] bubbleSort(int[] array) {

        int length = array.length;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (array[j-1]  > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    /*
        optimized by stopping the algorithm if inner loop did not cause any swap.
        Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
        Worst and Average Case Time Complexity: O(n2). Worst case occurs when array is reverse sorted.
     */
    static int[] bubbleSortOptimized(int[] array) {

        int length = array.length;
        int temp;
        boolean isSwaped;
        for (int i = 0; i < array.length; i++) {
            isSwaped = false;
            for (int j = 1; j < (length - i); j++) {
                if (array[j-1]  > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSwaped = true;
                }
            }
            if (isSwaped == false) break;
        }
        return array;
    }
}
