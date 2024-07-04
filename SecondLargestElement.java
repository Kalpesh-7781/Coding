import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n  = sc.nextInt();
        System.out.println("Array:");
        int arr[]= new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int SecondLargestElement = secondLargeElement(arr);
        System.out.println("SecondLargestElement:"+SecondLargestElement);

    }

    public static int secondLargeElement(int arr[]){

        Arrays.sort(arr);
        int res =  arr[arr.length-2];
    
        return res;
        
    }
}    
    