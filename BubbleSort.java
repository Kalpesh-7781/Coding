import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.println("Enter array:");
        int [] arr  = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    public static void bubbleSort(int[] arr){
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    }
               
                }
            }
        }
    
    }


