import java.util.*;

public class filter {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(35, 55, 46, 75, 80);

        marks.stream()
             .filter(mark -> mark >= 50)
             .forEach(mark -> System.out.println(mark));
    }
}