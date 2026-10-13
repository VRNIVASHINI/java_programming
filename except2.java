import java.util.*;
public class except2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(10.0/0.0);
        }
        catch(ArithmeticException e){
            System.out.println("cannot div by 0");
        }
    }
}