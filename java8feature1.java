import java.util.*;
import java.io.*;
public class java8feature1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]marks={10,20,30,40};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int num: marks){
            System.out.println(num);
        }
    }
}