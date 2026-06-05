import java.util.Scanner;
public class stringcombination {
    static void combination(String str,String result,int index) {
        if (index==str.length()){
            if(!result.isEmpty()){
                System.out.println(result);
            }
            return;
        }
        combination(str, result + str.charAt(index), index + 1);
        combination(str, result, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Combinations:");
        combination(str, "", 0);
        sc.close();
    }
}
