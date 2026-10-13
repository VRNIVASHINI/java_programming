import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(10);
        marks.add(20);
        marks.add(10);
        marks.add(5);
        marks.add(20);
        marks.add(50);
        marks.add(30);
        marks.add(20);

        System.out.println(marks);
        System.out.println(marks.contains(30));
        System.out.println(marks.size());
    }
}