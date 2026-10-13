import java.util.*;
import java.io.*;
public class filehandle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        File file=new File("students.txt");
        try{
            if(file.createNewFile())
            System.out.println("file created");
            else System.out.println("already exists");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}