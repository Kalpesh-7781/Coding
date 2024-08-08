import java.util.Scanner;

public class NumberOfDigits {
    
    public static void main(String[] args) {
        int n=0, a=0;
        System.out.print("Enter n  : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        
            while (n>0) {
                n=n/10;
                a++;

            }
            System.out.println("Digits:"+a);
            
        }
        
    }
    

