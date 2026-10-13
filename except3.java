import java.util.*;
public class except3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=25;
        if(age<18){
            throw new IllegalArgumentException("age must be above 18");
        }
        System.out.println("eligible");
    }
}