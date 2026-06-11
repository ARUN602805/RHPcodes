import java.util.Scanner;
public class AdjacentCellSum {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        if(r>0)sum+=mat[r-1][c];
        if(r<rows-1)sum+=mat[r+1][c];
        if(c>0)sum +=mat[r][c-1];
        if(c<cols-1)sum+=mat[r][c+1];
        System.out.println(sum);
    }

}
