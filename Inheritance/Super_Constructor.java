class A{
	A(int x){
		System.out.println("I am parent constructor. "+x);
	}
}
class B extends A{
	B(){
		super(100); //call parent constructor and pass parameter
		System.out.println("I am child constructor.");
	}
}
public class Super_Constructor{
	public static void main(String args[]){
		B b1=new B();
	}
}