import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectionSort {

    @Test
    public void selectionSortTest() {
    int [] array = {9,8,7,6,5,4,3,2,1};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void sortWithDuplicatedValues(){
        int [] array = {9,8,7,6,5,4,3,2,1,1,1,4,54};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void sortEmptyArray(){
        int [] array = {};

        selectionSort(array);
        assertTrue(Arrays.equals(array,new int[]{}));
    }

    private void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[index]){
                    index = j;
                }
            }
            int smallestValue = array[index];
            array[index] = array[i];
            array[i] = smallestValue;

        }
    }


}
