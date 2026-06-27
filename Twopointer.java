import java.util.*;
class Twopointer{
	static void twosum(int[] arr,int target){
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right){
			int sum=arr[left]+arr[right];
			if(sum==target){
				System.out.println(left+","+right);
				return;
			}
			else if(sum<target){
				left++;
			}
			else{
				right--;
			}
		}
		System.out.println("pointer is not involve");
	}
	public static void  main(String[] args){
		int[] arr={2,7,11,15,18};
		int target=9;
		twosum(arr,target);
	}
	
}
