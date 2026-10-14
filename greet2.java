import java.util.*;
interface greeting{
    void sayHello();
    default void sayBye(){
        System.out.println("bye");
    }
    static void Welcome(){
    System.out.println("Welcome");
    }
}
class c implements greeting{
    public void sayHello(){
        System.out.println("hello");
    }
}
public class greet2{
    public static void main(String[]args){
        c greet=new c();
        greet.sayHello();
        greet.sayBye();
        greeting.Welcome();
    }
}

