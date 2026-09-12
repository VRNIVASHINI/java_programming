import java.util.scanner;
public class uppertri{
    public static void main(string[]args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.next();
        int cols=sc.next();
        int[][]matrix=new int[rows][cols];
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(matrix[i][j]!=0){
                    isUpper=false;
                    break;
                }
            }
        }
        if(isUpper){
            System.out.print("upper triangle is matrix");
        }else{
            System.out.print("not an upper triangle matrix");
        }
    }
}
