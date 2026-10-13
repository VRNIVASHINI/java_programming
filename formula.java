import java.util.Scanner;
public class formula {

    static int area(int side) {
        return side * side;
    }


    static int area(int length, int breadth) {
        return length * breadth;
    }

    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 10));
        System.out.println(area(2.5));
    }
}
