import java.util.Scanner;

public class GreatestOfThree{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. 1 :");
    int x = sc.nextInt();
    System.out.println("Enter no. 2 :");
    int y = sc.nextInt();
    System.out.println("Enter no. 3 :");
    int z = sc.nextInt();

    if(x>y && x>z)
    System.out.println(+x+" is greatest");
    else if (y>z && y>x)
    System.out.println(+y+" is greatest");
    else 
    System.out.println(+z+" is greatest");

} 
}