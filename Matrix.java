import java.util.*;
import java.util.Scanner;
class Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		System.out.println("Enter the matrix : ");
        int[][] matrix1 = new int[n][n];
		int[][] matrix2 = new int[n][n];
		int[][] add=new int[n][n];
		System.out.println("Enter the m1 : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
		System.out.println("Enter the m2: ");
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=s.nextInt();
            }
        }
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                add[i][j]=matrix1[i][j] + matrix2[i][j];
            }
        }
		System.out.println("Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(add[i][j] + " ");
            }
			System.out.println();
        }
    }
}