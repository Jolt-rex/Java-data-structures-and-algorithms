import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(-3);

        System.out.println(Arrays.toString(list.toArray()));
        list.printMiddleNode();

        System.out.println("Finished");
    }
}