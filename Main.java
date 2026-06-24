import java.util.*;
class vehicle{
	void display(){
		System.out.println("This is vehicle");
	}
}
class car extends vehicle{
	void display(){
		System.out.println("This is car");
		super.display();
	}
	
}
class Main{
	public static void main(String[] args){
		car obj=new car();
		obj.display();
	}
}