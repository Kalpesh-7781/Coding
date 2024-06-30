import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestElement = largest(arr);
        System.out.println("Largest element in the array is: " + largestElement);
        sc.close();
    }

    public static int largest(int[] arr) {
        int max = arr[0]; // Initialize max with the first element of the array
        for (int i = 1; i < arr.length; i++) { // Start loop from the second element
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }
        return max;
    }
}