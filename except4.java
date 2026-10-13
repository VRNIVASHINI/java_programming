import java.util.*;

public class except4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("negative age");
            } else if (age > 100) {
                throw new IllegalArgumentException("age above 100");
            }

            System.out.println(age);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}