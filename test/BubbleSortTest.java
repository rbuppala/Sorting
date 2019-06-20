import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void sortIntegers() {
        int[] array = {5,1,12,-5,16,2,12,14};
        int[] sortedArray = BubbleSort.bubbleSort(array);
        int[] expectedArray = {-5, 1, 2, 5, 12, 12, 14, 16};
        assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void sortAllNegative() {
        int[] array = {-1,-5,-2,-4,-9,-6};
        int[] sortedArray = BubbleSort.bubbleSort(array);
        int[] expectedArray = {-9,-6,-5,-4,-2,-1};
        assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void sortAllPostive() {
        int[] array = {9,15,2,18,99,100};
        int[] sortedArray = BubbleSort.bubbleSort(array);
        int[] expectedArray = {2,9,15,18,99,100};
        assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void repeated() {
        int[] array = {0,1,0};
        int[] sortedArray = BubbleSort.bubbleSort(array);
        int[] expectedArray = {0,0,1};
        assertArrayEquals(sortedArray, expectedArray);
    }
}
