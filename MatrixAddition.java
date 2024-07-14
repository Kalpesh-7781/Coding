import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter Columns:");
        int cols = sc.nextInt();

        int m1 [][]= new int [rows][cols];
        int m2 [][]= new int [rows][cols];
        int add[][]=new int[rows][cols];


        System.out.println("Enter matrix 1:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Matrix 2:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                add[i][j]=m1[i][j]+m2[i][j];
            }
        }

        System.out.println("Addition of two matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }


    
}
