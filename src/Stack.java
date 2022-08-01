import java.util.Arrays;

public class Stack {
    private int[] items;
    private int count;

    public Stack(int size) {
        items = new int[size];
        this.count = 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    // push
    public void push(int item) {
        if(count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    // pop
    public int pop() {
        if(count > 0)
            return items[--count];

        return -1;
    }

    // peek
    public int peek() {
        if(count > 0)
            return items[count-1];

        return -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    // int[]
    public int[] toArray() {
        return Arrays.copyOfRange(items, 0, count);
    }
}
