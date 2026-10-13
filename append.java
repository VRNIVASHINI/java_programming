import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class append{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("names.txt", true);

            System.out.println("Enter 5 names:");

            for (int i = 0; i < 5; i++) {
                String name = sc.nextLine();
                fw.write(name + "\n");
            }

            fw.close();
            System.out.println("Names appended to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}