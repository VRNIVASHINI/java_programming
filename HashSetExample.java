import java.util.Scanner;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> marks = new HashSet<>();

        marks.add(10);
        marks.add(20);
        marks.add(10);
        marks.add(30);
        marks.add(20);

        System.out.println(marks);
        System.out.println(marks.contains(30));
        System.out.println(marks.size());
    }
}
