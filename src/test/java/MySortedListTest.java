import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

//class User implements Comparable<User> {
//    private int id;
//
//    public User(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public int compareTo(User o) {
//        if (this.id == o.id)
//            return 0;
//        if (this.id > o.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//
//        User user = (User) o;
//
//        return id == user.id;
//
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                '}';
//    }
//}

public class MySortedListTest {

    @Test
    public void shouldAddElementsInTheMiddleTest() {
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);

        User user5 = new User(5);
        User user6 = new User(6);
        User user7 = new User(7);
        User user8 = new User(8);

        User user9 = new User(5);
        User user10 = new User(5);
        User user11 = new User(5);

        MySortedList sortedList = new MySortedList();

        sortedList.add(user);
        sortedList.add(user2);
        sortedList.add(user3);
        sortedList.add(user4);
        sortedList.add(user5);
        sortedList.add(user6);
        sortedList.add(user7);
        sortedList.add(user8);
        sortedList.add(user9);
        sortedList.add(user10);
        sortedList.add(user11);

        Object[] expected = new Object[11];
        expected[0] = user;
        expected[1] = user2;
        expected[2] = user3;
        expected[3] = user4;
        expected[4] = user5;

        expected[5] = user9;
        expected[6] = user10;
        expected[7] = user11;

        expected[8] = user6;
        expected[9] = user7;
        expected[10] = user8;

        Assert.assertArrayEquals(expected, sortedList.getSortedList());
    }

    @Test
    public void shouldSortArray() {
        MySortedList mySortedList = new MySortedList();
        for (int i = 30; i >= 0; i--) {
            mySortedList.add(new User(i));
        }
        Object[] sortedList = new Object[31];
        for (int i = 0; i <=30; i++) {
            sortedList[i] = new User(i);
        }
        Assert.assertArrayEquals(sortedList, mySortedList.getSortedList());
    }

    @Test
    public void addToTheEndOfListTest(){
        MySortedList mySortedList = new MySortedList();
        for (int i = 0; i <=30; i++) {
            mySortedList.add(new User(i));
        }

        Object[] sortedList = new Object[31];
        for (int i = 0; i <=30; i++) {
            sortedList[i] = new User(i);
        }

        Assert.assertArrayEquals(sortedList, mySortedList.getSortedList());
    }
}
