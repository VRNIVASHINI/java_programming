import java.util.*;
import java.io.*;
public class filehandle1{


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        File file=new File("students.txt");
        System.out.println(file.exists());
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());
    }
}