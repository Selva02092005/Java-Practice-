import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
        int[][] a = new int[n][n];
		
		System.out.println("Enter Matrix: ");
        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int min = a[i][0];
            int colIndex = 0;

            // Find minimum element in current row
            for (int j = 1; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    colIndex = j;
                }
            }

            // Check whether min is maximum in its column
            boolean saddle = true;

            for (int k = 0; k < n; k++) {
                if (a[k][colIndex] > min) {
                    saddle = false;
                    break;
                }
            }

            if (saddle) {
                System.out.println("Saddle Point = " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}