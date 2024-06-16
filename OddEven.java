import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int x = sc.nextInt();
        if(x%2==0)
        {
            System.out.println("Even no.");
        }
        else
        {
            System.out.println("odd no.");
        }

    }
    
}
