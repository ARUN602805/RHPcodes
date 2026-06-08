import java.util.Scanner;
public class matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int [2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<2;i++){
            int largest=matrix[i][0];
            for(int j=1;j<2;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
            sum+=largest;
        }
        System.out.println(sum);
        sc.close();
    }
}