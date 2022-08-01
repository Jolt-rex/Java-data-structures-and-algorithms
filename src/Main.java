import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        DoubleStack ds = new DoubleStack(6);

        ds.push1(10);
        ds.push1(20);
        ds.push1(30);

        ds.push2(50);
        ds.push2(60);

        System.out.println(ds);

        System.out.println(ds.pop2());

        System.out.println(ds);
    }
}