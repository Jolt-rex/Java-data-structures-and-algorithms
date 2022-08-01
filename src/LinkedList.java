import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    private boolean isEmpty() {
        return size == 0;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    // addFirst
    public void addFirst(int value) {
        var node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    // addLast
    public void addLast(int value) {
        var node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    // deleteFirst
    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    // deleteLast
    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }

    // contains
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // indexOf
    public int indexOf(int value) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        var array = new int[size];

        var current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void print() {
        var current = first;
        System.out.println("List:");
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    private void swapFirstAndLast() {
        var tmp = first;
        first = last;
        last = tmp;
    }

    public void reverse() {
        if(isEmpty()) return;

        var prev = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = prev;
    }

    public int getKthFromTheEnd(int k) {
        if (k <= 0 || k > size)
            throw new IllegalArgumentException();

        var a = first;
        var b = first;

        for(int i = 0; i < k-1; i++)
            b = b.next;

        while(b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }
}