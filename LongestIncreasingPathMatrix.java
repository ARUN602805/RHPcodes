import java.util.Scanner;

public class LongestIncreasingPathMatrix {
    static int[][] dp;
    static int[][] matrix;
    static int rows, cols;
    static int dfs(int r,int c){
        if(dp[r][c]!=0)
            return dp[r][c];
        int max=1;
        int[] dr={-1, 1, 0, 0};
        int[] dc={0, 0, -1, 1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if (nr>=0&&nc>=0&&nr<rows&&nc<cols
                    &&matrix[nr][nc]>matrix[r][c]) {
                max=Math.max(max,1+dfs(nr, nc));
            }
        }
        return dp[r][c]=max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        cols=sc.nextInt();
        matrix=new int[rows][cols];
        dp=new int[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                ans=Math.max(ans, dfs(i, j));
            }
        }
        System.out.println(ans);
    }
}
