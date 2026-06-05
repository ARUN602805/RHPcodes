import java.util.Scanner;

public class panagram2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine().toUpperCase();
        boolean[] letters=new boolean[26];
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (ch >='A' && ch<='Z') {
                letters[ch - 'A']=true;
            }
        }
        boolean isPangram=true;
        for (int i=0;i<26;i++) {
            if (!letters[i]) {
                isPangram=false;
                break;
            }
        }
        if (isPangram){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }
        sc.close();
    }
}