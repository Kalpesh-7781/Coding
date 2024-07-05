import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter array1 :");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter array2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, arr2);
        
        System.out.println("Merged Sorted Array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
        sc.close();
        
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        //int i = 0, j = 0, k = 0;
        int k = 0;

        for (int i = 0; i < n1; i++) {
            mergedArray[k++] = arr1[i];
        }

        // while (i < n1 && j < n2) {
        //     if (arr1[i] <= arr2[j]) {
        //         mergedArray[k] = arr1[i];
        //         i++;
        //         k++;
        //     } else {
        //         mergedArray[k] = arr2[j];
        //         j++;
        //         k++;
        //     }
        // }

        // while (i < n1) {
        //     mergedArray[k] = arr1[i];
        //     i++;
        //     k++;
        // }

        // while (j < n2) {
        //     mergedArray[k] = arr2[j];
        //     j++;
        //     k++;
        // }


        for (int i = 0; i < n2; i++) {
            mergedArray[k++] = arr2[i];
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }
    
}
