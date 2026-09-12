import java.util.*;

public class maxsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxColumn = 0;

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += a[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j;
            }
        }

        System.out.println("column " + (maxColumn + 1) + " has sum of " + maxSum);

    }
}