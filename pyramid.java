import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r = 1; r <= n; r++){
            for(int s = 1; s<=n-r;s++){
                system.out.print(s:" ");
            }
            for(int c= 1; c<=2*r-1;c++)
            {
                system.out.print(s:"*");
            }
            system.out.print();
        }
    }    
}   