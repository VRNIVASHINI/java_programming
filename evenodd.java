import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Move even numbers to the front
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {

                for (int j = i + 1; j < n; j++) {

                    if (arr[j] % 2 == 0) {

                        int temp = arr[j];

                        // Shift elements right
                        for (int k = j; k > i; k--) {
                            arr[k] = arr[k - 1];
                        }

                        arr[i] = temp;
                        break;
                    }
                }
            }
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 