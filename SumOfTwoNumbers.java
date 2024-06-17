import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1 :");
        int x = sc.nextInt();
        System.out.println("Enter no. 2 :");
        int y = sc.nextInt();
        
        int z = x+y;
        System.out.println("Sum of" + x +"&" + y +":" + z);
        
    }
}