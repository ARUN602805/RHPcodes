import java.util.Scanner;
public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        int maxLen=0;
        for (int i=1;i<=m;i++) {
            for (int j=1;j<=n;j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    maxLen=Math.max(maxLen,dp[i][j]);
                } else{
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(maxLen);
    }
}
