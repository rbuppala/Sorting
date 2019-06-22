import java.util.Arrays;

/*
    Quick Sort is a divide and Conquer algorithm.

    Divide Step

    - Chose an item p (known as Pivot) and partition the items a[i...j] into two parts
        - Items that are smaller than P
        - Items that are greater than or equal to P
     Recursively sort two parts

 */
public class QuickSort {

    public static void main(String args[]) {
        int[] array = {6,2,4,7,5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);

        }
    }

    /* This function takes last element as pivot, places the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right
   of pivot */
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1); //// index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;

    }


}
