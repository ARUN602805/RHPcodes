import java.util.Scanner;
public class ColumnWiseMaximum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][2];
        System.out.println("Enter 4 elements:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int j=0;j<2;j++){
            int max=a[0][j];
            for(int i=1;i<2;i++){
                if(a[i][j]> max){
                    max=a[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + " Maximum = " + max);
            sum += max;
        }
        System.out.println("Sum of Column Maximum Values = " + sum);
    }
}