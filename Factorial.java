import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
       
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=n;
        for(int i=1;i<n;i++)
        {
            fact = fact*(n-i);
        }
        System.out.println("Fact:" +fact);
        sc.close();
    }
}