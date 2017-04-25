
public class MySortedList2<T extends Comparable>{

    private int INITIAL_SIZE = 10;
    private Object[] list = new Object[INITIAL_SIZE];
    private int counter = 0;

    public void add(T element){
        if (counter+1>list.length){
            doubleListSize();
        }
        if(element == null){
            throw new IllegalArgumentException();
        }
        list[counter] = element;
        counter++;

    }

    public Object[] getList(){
        Object[] sortedList = new Object[counter];
        int j;
        T newValue;

        for (int i = 0; i< counter  ; i++) {
            j=i;
            newValue = (T) list[j];
            while(j>0&&newValue.compareTo(list[j-1])<0){
                list[j] = list[j-1];
                j--;
            }
            list[j] = newValue;
        }
        System.arraycopy(list,0,sortedList,0,counter);


        return  sortedList;
    }

    private void doubleListSize() {
        Object[] temp = new Object[list.length*2];
        System.arraycopy(list,0,temp,0,counter);
        list=temp;
    }
}
