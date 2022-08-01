import java.util.Arrays;

public class DoubleStack {
    private int[] items;
    private int firstCount = 0;
    private int secondCount = 0;

    public DoubleStack(int size) {
        items = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, firstCount)) + "\n" +
                Arrays.toString(Arrays.copyOfRange(items, items.length - secondCount, items.length));
    }

    private boolean isFull() {
        return firstCount + secondCount == items.length;
    }

    public void push1(int item) {
        if(isFull())
            throw new StackOverflowError();

        items[firstCount++] = item;
    }

    public void push2(int item) {
        if(isFull())
            throw new StackOverflowError();

        items[items.length - ++secondCount] = item;
    }


}
