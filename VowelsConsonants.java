import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        int vow=0 , con=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to count of  Vowels & Consonants: ");
        String str = sc.next();
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vow++;
        }
        else if (ch >= 'a' && ch <= 'z'){
        con++;
    }
    }
    System.out.println("Count of vowel:"+vow);
    System.out.println("Count of Consonant:"+con);
    sc.close();
    }
}
