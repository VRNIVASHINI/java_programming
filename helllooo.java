import java.util.Scanner;
class student {
    int mark1, mark2, mark3;

    // Constructor
    student(int a, int b, int c) {
        mark1 = a;
        mark2 = b;
        mark3 = c;
    }

    double average() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    char grade() {
        double avg = average();

        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 50)
            return 'D';
        else
            return 'F';
    }

    String result() {
        if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35)
            return "Pass";
        else
            return "Fail";
    }
}
public class helllooo{
    public static void main(String[]args){
        student s1 = new student(50,70,60);
        System.out.println(s1.average());
          System.out.println(s1.grade());
            System.out.println(s1.result());
    }
}