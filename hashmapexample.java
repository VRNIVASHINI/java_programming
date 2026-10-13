import java.util.Scanner;
import java.util.HashMap;

public class hashmapexample {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101,"arun");
        students.put(102,"bala");
        students.put(103,"kumar");
        System.out.println(students);
    }
}