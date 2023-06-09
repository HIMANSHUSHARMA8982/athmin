package Athmini_test;


abstract class a{
	abstract void a(){
		System.out.println("A");
		
	}
}
class b extends a{
	b(){
		System.out.println("B");
		
	}
	void ab(){
		
		System.out.println("ab");
		
		
	}
}
public class constructor {
	public static void main(String args[]) {
		a obj1 = new b();
		b obj2 = new b();
		
		obj2.ab();
		
	}

}
