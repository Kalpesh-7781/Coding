import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check Palindrome: ");
        String str = sc.next();
        str = str.toLowerCase();
        String rev = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            rev = ch + rev; // adds each character in front of the existing string
        }
        if (str.equals(rev)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
        
        sc.close();
    }
}
