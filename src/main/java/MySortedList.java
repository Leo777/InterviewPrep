

public class MySortedList<T extends Comparable> {

    private int INITIAL_SIZE = 10;
    private Object[] list = new Object[INITIAL_SIZE];
    private int counter = 0;

    public void add(T element) {
        if (counter == 0) {
            list[0] = element;
            counter++;
        } else if (element.compareTo(list[counter - 1]) > 0) {
            //TODO check size
            if (counter + 1 > list.length){

                Object[] temp = new Object[list.length * 2];
                System.arraycopy(list, 0, temp, 0, counter);
                list = temp;
            }

            list[counter] = element;
            counter++;
        } else {
            int position = binarySearch(list, element, counter);
            shift(position);
            list[position] = element;

            counter++;
        }
    }

    public Object[] getSortedList() {
        Object[] clone = new Object[counter];
        System.arraycopy(list, 0, clone, 0, counter);
        return clone;
    }
    //TODO return index minimum value greater then element
    public int binarySearch(Object[] elements, T key, int counter) {
        //TODO search only from 0 to Counter

        int low = 0;
        int high = counter;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (key.compareTo(elements[mid]) == 0) {
                return mid;
            }

            if (key.compareTo(elements[mid]) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private void shift(int position) {

        if (counter + 1 < list.length) {
            System.arraycopy(list, position, list, position + 1, counter - position);

        } else {
            doubleListSize(position);

        }
    }

    private void doubleListSize(int position) {
        Object[] temp = new Object[list.length * 2];

        //TODO copy everything before position to the same place
        //
        System.arraycopy(list, 0, temp, 0, position);
        System.arraycopy(list, position, temp, position + 1, counter - position);
        list = temp;
    }


}
