import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MySortedLinkedListTest {

    @Test
    public void shouldSortElements() {

        MySortedLinkedList list = new MySortedLinkedList();
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);
        User user6 = new User(6);
        User user7 = new User(7);
        User user8 = new User(8);

        list.add(user8);
        list.add(user7);
        list.add(user6);
        list.add(user5);
        list.add(user4);
        list.add(user3);
        list.add(user2);
        list.add(user);

        Assert.assertEquals(user, list.getElement(0));
        Assert.assertEquals(user2, list.getElement(1));
        Assert.assertEquals(user3, list.getElement(2));
        Assert.assertEquals(user4, list.getElement(3));
        Assert.assertEquals(user5, list.getElement(4));
        Assert.assertEquals(user6, list.getElement(5));
        Assert.assertEquals(user7, list.getElement(6));
        Assert.assertEquals(user8, list.getElement(7));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.getElement(i));
        }
    }

    @Test
    public void shouldGetSortedList() {

        List<User> usersList = new ArrayList<User>();
        MySortedLinkedList list = new MySortedLinkedList();
        User user = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);
        User user6 = new User(6);
        User user7 = new User(7);
        User user8 = new User(8);

        list.add(user8);
        list.add(user7);
        list.add(user6);
        list.add(user5);
        list.add(user4);
        list.add(user3);
        list.add(user2);
        list.add(user);

        usersList.add(user);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        usersList.add(user6);
        usersList.add(user7);
        usersList.add(user8);

        List<User> sortedList = list.getSorted();

        Assert.assertEquals(usersList, sortedList);
    }

    @Test
    public void shouldAddOneElementToTheList() {
        MySortedLinkedList list = new MySortedLinkedList();
        User user = new User(1);
        list.add(user);
        Assert.assertEquals(user, list.getElement(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        MySortedLinkedList list = new MySortedLinkedList();
        list.add(null);
    }
}
