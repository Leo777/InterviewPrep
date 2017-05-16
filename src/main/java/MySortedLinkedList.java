import java.util.ArrayList;
import java.util.List;

public class MySortedLinkedList<T extends Comparable> {
    private Node root;
    private int counter = 0;


    public MySortedLinkedList() {
        root = null;
    }

    public void add(Comparable element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        if (root == null) {
            root = new Node(element);
            counter++;
            return;
        }

        Node newNode = new Node(element);
        Node current = root;

        if (current.element.compareTo(newNode.element) > 0) {
            newNode.next = root;
            root = newNode;

        } else {
            while (current.next != null) {


                if (current.next.element.compareTo(newNode.element) > 0) {
                    newNode.next = current.next;
                    current.next = newNode;
                    counter++;
                    return;
                }
                current = current.next;

            }
            current.next = newNode;
        }
        counter++;
    }

    public Comparable getElement(int i) {
        int position = 0;

        if (i > counter) {
            throw new IndexOutOfBoundsException();
        }

        Node current = root;
        while (position != i) {
            current = current.next;
            position++;
        }
        return current.element;
    }

    public List<Comparable> getSorted() {
        List<Comparable> sortedList = new ArrayList<Comparable>();
        Node current = root;
        for (int i = 0; i < counter; i++) {
            sortedList.add(current.element);
            current = current.next;
        }
        return sortedList;
    }

    private class Node<E> {
        Comparable element;
        Node<E> next;

        public Node(Comparable element) {
            this.element = element;
            this.next = null;

        }
    }

    public int size() {
        return counter;
    }
}
