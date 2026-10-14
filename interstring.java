import java.util.*;
@FunctionalInterface
interface Check {
    boolean check(String str);
}

public class interstring {
    public static void main(String[] args) {

   
        Check c = str -> str.length() > 5;

        System.out.println(c.check("Hello"));       
        System.out.println(c.check("Welcome"));     
    }
}