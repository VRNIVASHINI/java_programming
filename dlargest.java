import java.util.*;

public class dlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println(max);
    }
}

