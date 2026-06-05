import java.util.Scanner;

public class Pangram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine().toLowerCase(); // Reads input without spaces
        boolean[] letters = new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='a' && ch<='z'){
                letters[ch - 'a']=true;
            }
        }
        boolean isPangram=true;
        for (int i=0;i<26;i++){
            if (!letters[i]){
                isPangram=false;
                break;
            }
        }
        if(isPangram) {
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }

        sc.close();
    }
}