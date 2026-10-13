import java.util.*;
import java.io.*;
public class filehandle2{


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
        try(FileWriter writer=new FileWriter("students.txt")){
            writer.write("arun\n");
            writer.write("bala\n");
            writer.write("bharath\n");
            System.out.println("written successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}