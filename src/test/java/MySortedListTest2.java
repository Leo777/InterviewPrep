import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;



public class MySortedListTest2 {
    private MySortedList2 sortedList2 = new MySortedList2();
    private Object[] expected = getExpectedList();

    @Before
    public void init() {
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(7);
        User user6 = new User(5);
        User user7 = new User(6);
        User user8 = new User(9);
        User user9 = new User(10);
        User user10 = new User(11);
        User user11 = new User(15);
        User user12 = new User(12);

        sortedList2.add(user);
        sortedList2.add(user2);
        sortedList2.add(user3);
        sortedList2.add(user4);
        sortedList2.add(user5);
        sortedList2.add(user7);
        sortedList2.add(user8);
        sortedList2.add(user9);
        sortedList2.add(user10);
        sortedList2.add(user11);
        sortedList2.add(user12);
        sortedList2.add(user6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfElementIsNull(){

        sortedList2.add(null);
    }

    @Test
    public void testSortedList() {
        System.out.println(Arrays.toString(sortedList2.getList()));
        Assert.assertArrayEquals(expected, sortedList2.getList());
    }

    @Test
    public void shouldAddElementsToMySortedList() {
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(7);
        User user6 = new User(5);
        User user7 = new User(6);
        User user8 = new User(9);
        User user9 = new User(10);
        User user10 = new User(11);
        User user11 = new User(15);
        User user12 = new User(12);

        MySortedList sortedList = new MySortedList();

        sortedList.add(user);
        sortedList.add(user2);
        sortedList.add(user3);
        sortedList.add(user4);
        sortedList.add(user5);
        sortedList.add(user7);
        sortedList.add(user8);
        sortedList.add(user9);
        sortedList.add(user10);
        sortedList.add(user11);
        sortedList.add(user12);


    }

    public Object[] getExpectedList() {
        Object[] expectedList = new Object[12];
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);
        User user6 = new User(6);
        User user7 = new User(7);


        User user8 = new User(9);
        User user9 = new User(10);
        User user10 = new User(11);
        User user11 = new User(12);
        User user12 = new User(15);

        expectedList[0] = user;
        expectedList[1] = user2;
        expectedList[2] = user3;
        expectedList[3] = user4;
        expectedList[4] = user5;
        expectedList[5] = user6;
        expectedList[6] = user7;
        expectedList[7] = user8;
        expectedList[8] = user9;
        expectedList[9] = user10;
        expectedList[10] = user11;
        expectedList[11] = user12;

        return expectedList;
    }


//
//
//    private void shift(){
//        int [] array2 = new int[10];
//        System.arraycopy(array1,0,array2,0,array1.length);
//        System.out.println(Arrays.toString(array2));
//        System.arraycopy(array2,4,array2,5,array2.length-5);
//        array1=array2;
//        System.out.println(Arrays.toString(array1));
//    }
}
