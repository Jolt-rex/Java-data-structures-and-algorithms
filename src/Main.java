import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        DoubleStack ds = new DoubleStack(6);

        System.out.println(ds);

        ds.push1(10);
        ds.push2(50);
        ds.push1(20);
        ds.push2(60);
        ds.push1(30);

        System.out.println(ds);


    }
}