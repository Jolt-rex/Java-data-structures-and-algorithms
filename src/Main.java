import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);


        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(2));

        System.out.println("Finished");
    }
}