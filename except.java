import java.util.*;

public class except {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("start");

        try {
            System.out.println("entered Try Block");
            System.out.println(a/b);
            System.out.println("completed Try Block");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("program completed");
    }
}