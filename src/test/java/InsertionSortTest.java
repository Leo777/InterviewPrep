import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void insertionSortTest() {
        int[] array = {9, 7, 8, 6, 5, 4, 3, 2, 1, 0};

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private void insertionSort(int[] array) {
        int j, newValue;
        for (int i = 1; i < array.length; i++) {

            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = newValue;
        }
    }

}
