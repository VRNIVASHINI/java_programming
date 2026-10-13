import java.util.Scanner;
import java.util.ArrayList;

public class righttrot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                num = 0;
            }

            marks.add(num);
        }

        
        int last = marks.get(marks.size() - 1);

        for (int i = marks.size() - 1; i > 0; i--) {
            marks.set(i, marks.get(i - 1));
        }

        marks.set(0, last);
        for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + " ");
        }

        sc.close();
    }
}