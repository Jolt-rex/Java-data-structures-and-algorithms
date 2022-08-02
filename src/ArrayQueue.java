import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front = 0;
    private int back = 0;
    private int count = 0;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    // enqueue
    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();

        items[back] = item;
        back = (back + 1) % items.length;
        count++;
    }

    // dequeue
    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();

        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    // peek
    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();

        return items[front];
    }

    // isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    // isFull
    public boolean isFull() {
        return count == items.length;
    }
}
