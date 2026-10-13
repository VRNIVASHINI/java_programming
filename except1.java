import java.util.*;

public class except1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("Program completed");
          
        }
    }
}