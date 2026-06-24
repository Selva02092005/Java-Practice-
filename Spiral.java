import java.util.*;
import java.util.Scanner;
class Spiral {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n=s.nextInt();
		
        int[][] arr = new int[n][n];
		
		System.out.print("Enter the arr : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
		int top=0;
		int bottom =n-1;
		int left=0;
		int right=n-1;
		
		while(top<=bottom && left<=right){
			System.out.println("Top");
			for(int i=left;i<=right;i++){
				System.out.print(arr[top][i] + " ");
			}
			
			top++;
			System.out.println("Right");
			for(int i=top;i<=bottom;i++){
				System.out.print(arr[i][right] + " ");
			}
			
			right--;
			System.out.println("Bottom");
			for(int i=right;i>=left;i--){
				System.out.print(arr[bottom][i] + " ");
			}
			
			bottom--;
			System.out.println("Left");
			for(int i=bottom;i>=top;i--){
				System.out.print(arr[i][left] + " ");
			}
			left++;
		}
		
	}
}