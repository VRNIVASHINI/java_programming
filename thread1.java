import java.util.*;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        System.out.println(i);
    }
}
public class thread1{
    public static void main(String[]args){
        MyThread t=new MyThread();
        t.run();
    }
}