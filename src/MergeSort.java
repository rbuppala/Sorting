import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] array, int low, int high) {

        if (array.length < 2) return;

        if (low < high) {
            int middle = (low + high) / 2;
            // Sort first and second halves
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            // Merge the sorted halves
            mergeHalves(array, low,middle, high);
        }

    }

    /*
        Merges two subarrays of arr[].
        First subarray is arr[l..m]
        Second subarray is arr[m+1..r]
      */

    public static void mergeHalves(int[] array, int low,int middle, int high) {

        // Find sizes of two subarrays to be merged
        int n1 = middle - low + 1;
        int n2 = high - middle;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];


        /*Copy data to temp arrays*/
        for (int i = 0; i < n1;i++) {
            L[i] = array[low + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = array[middle + 1 + j];
        }
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = low;

        while ( i < n1 && j < n2) {
            if ( L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
