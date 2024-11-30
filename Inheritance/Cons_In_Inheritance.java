class A{
	A(){
		System.out.println("I am Parent constructor.");
	}
}
class B extends A{
	B(){
		System.out.println("I am child constructor.");
	}
}
public class Cons_In_Inheritance{
	public static void main(String args[]){
		B b1=new B();
	}
}