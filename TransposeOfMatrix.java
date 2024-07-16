import java.util.Scanner;

public class TransposeOfMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter Columns:");
        int cols = sc.nextInt();

        int m1 [][]= new int [rows][cols];
        int m2 [][]= new int [rows][cols];

        System.out.println("Enter matrix 1:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Entered matrix :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(m1[i][j]+" "); 
            }
            System.out.println();
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                    m2[i][j] += m1[j][i];
                
            }
        }

        System.out.println("Transpose of matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}