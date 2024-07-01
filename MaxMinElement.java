import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n  = sc.nextInt();
        System.out.println("Array:");
        int arr[]= new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int MaxElement = maxElement(arr);
        System.out.println("MaxElement:"+MaxElement);
        int MinElement =minElement(arr);
        System.out.println("MinElement:"+MinElement);
        
    }

    public static int maxElement(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    public static int minElement(int arr[]){
        int min= arr[0];
        for(int i= 0;i<arr.length;i++){
            if(arr[i]<min){
                min=  arr[i];
            }
        }
        return min;
    }
    
}
