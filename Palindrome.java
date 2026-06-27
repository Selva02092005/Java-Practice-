import java.util.*;
class Palindrome{
	static boolean isPalin(String s){
		if(s==null || s.isEmpty()){
			return false;
		}
		int left=0;
		int right=s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				System.out.println("Not a Plaindrome");
				return false;
			}
			else{
				left++;
				right--;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(isPalin(s)){
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Not a Plaindrome");
		}
	}
}