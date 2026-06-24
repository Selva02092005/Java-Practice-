import java.util.*;
import java.util.Scanner;
class Trans {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n=s.nextInt();
		System.out.println("Enter the matrix : ");
        int[][] matrix1 = new int[n][n];
		int[][] result = new int[n][n];
		
		System.out.println("Enter the m1 : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
		
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][j]=matrix1[j][i];
            }
        }
		System.out.println("Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j] + " ");
            }
			System.out.println();
        }
    }
}