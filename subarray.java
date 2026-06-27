import java.util.*;
class subarray{
	public static void main(String[] args){
		
		int arr[]={-2,1,-3,4,-1,2,5,100};
		int n=arr.length;
		int maxsum=0;
		for(int i=0;i<n;i++){
			int sum=arr[i];
			maxsum=Math.max(maxsum,sum);
			for(int j=i+1;j<n;j++){
				sum+=arr[j];
				maxsum=Math.max(maxsum,sum);
			}
		}
		System.out.print(maxsum);
	}
}
				