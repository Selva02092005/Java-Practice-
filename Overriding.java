import java.util.*;
class A{
	void display(){
		System.out.println("This is vehicle");
	}
}
class B extends A{
	
	void display(){
		System.out.println("This is car");
		
	}
	
}
class Overriding{
	public static void main(String[] args){
		B obj=new B();
		obj.display();
	}
}