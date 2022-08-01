public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
        count = 0;
    }

    public void print() {
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
    // insert
    public void insert(int number) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = number;
    }

    // removeAt
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    // indexOf
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;
    }

    public int max() {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < count; i++)
            largest = (largest < items[i]) ? items[i] : largest;

        return largest;
    }

    public void reverse() {
        for(int i = 0; i < count / 2; i++) {
            int tmp = items[i];
            items[i] = items[count - i - 1];
            items[count - i - 1] = tmp;
        }
    }

    public void insertAt(int item, int index) {
        if(items.length == count) {
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        for(int i = ++count; i > index; --i)
            items[i] = items[i - 1];

        items[index] = item;
    }
}
