import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 06.04.2017.
 */
public class BinarySearchTest2 {
    @Test
    public void findIndexInTheMiddle() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(4, binarySearchImpl(array, 5));
    }

    @Test
    public void findIndexForCornerVlauesOfTheArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(9, binarySearchImpl(array, 10));
        assertEquals(0, binarySearchImpl(array, 1));
    }

    @Test
    public void findIndexInArrayWithDuplicatedValues() {
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(2, binarySearchImpl(array, 3));
    }

    @Test
    public void findIndexIfArrayHaveOnlyOneElement() {
        int[] array = {1};

        assertEquals(0, binarySearchImpl(array, 1));
    }

    @Test
    public void shouldReturnNegativeValueWhenValueIsMissed() {
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(-1, binarySearchImpl(array, 100));
    }

     @Test
    public void shouldReturnNegativeValueWhenEmptyArray() {
        int[] array = {};

        assertEquals(-1, binarySearchImpl(array, 100));
    }

    private int binarySearchImpl(int[] array, int key) {
        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int middle = (low+high)/2;

            if(array[middle] == key){
                return middle;
            }

            if(array[middle]>key){
                high=middle-1;
            }else {

                low = middle+1;
            }

        }



        return -1;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
