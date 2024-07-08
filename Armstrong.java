import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("Armstrong");
        } else {
            System.out.println("not Armstrong");
        }
    }

    public static boolean isArmstrong(int n){
        int originalNum = n;
        int result = 0;
        while (n!= 0) {
            int digit = n%10;
            result += (digit*digit*digit);
            n /=10;
        }
        return result==originalNum;
    }
}
