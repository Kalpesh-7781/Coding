import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1 :");
        int x = sc.nextInt();
        System.out.println("Enter no. 2 :");
        int y = sc.nextInt();

        System.out.println("Before swap: " +x +" ,"+y  );
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swap: " +x +" ,"+y  );

    }
}
