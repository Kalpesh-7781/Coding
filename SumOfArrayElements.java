import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        int sum =sumOfArray(arr);

        System.out.println("Sum :"+sum);
    }

    public static int sumOfArray(int arr[]){
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < arr.length; j++) {
                sum= sum + arr[i];
            }
            
        
        return sum;

    }
}
