import java.util.HashMap;
import java.util.Scanner;

public class Longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String str=sc.next();
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLength=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='0')
                sum-=1;
            else
                sum+=1;
            if (map.containsKey(sum)) {
                maxLength=Math.max(maxLength, i-map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Longest substring length: " + maxLength);
    }
}