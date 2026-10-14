import java.util.*;
interface greeting{
    void sayHello();
}
class c implements greeting{
    public void sayBye(){
        System.out.println("bye");
    }
    public void sayHello(){
        System.out.println("hello");
    }
}
public class greet1{
    public static void main(String[]args){
        c greet=new c();
        greet.sayHello();
    }
}