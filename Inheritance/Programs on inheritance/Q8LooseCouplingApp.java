import java.util.*;
abstract class Value{
	int a,b;
	void setValue(int x,int y){
		a=x;
		b=y;
	}
	abstract void performCalculation();
}
class Add extends Value{
	void performCalculation(){
		System.out.println("\nAddition is: "+(a + b));
	}	
}
class Mul extends Value{
	void performCalculation(){
		System.out.println("\nMultiplication is: "+(a * b));
	}
}
class Div extends Value{
	void performCalculation(){
		System.out.println("\nDivision is: "+(a / b));
	}
}
class Sub extends Value{
	void performCalculation(){
		System.out.println("\nSubstraction is: "+(a - b));
	}
}
class Calculator{
	void performOperation(Value v){
		v.performCalculation();
	}
}
public class Q8LooseCouplingApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		System.out.print("First no.: ");
		int fno=sc.nextInt();
		System.out.print("Second no.: ");
		int sno=sc.nextInt();
		
		Calculator cal = new Calculator();
		
		while(true){
			System.out.println("\nPerform Below Operations");
			System.out.println("=============================");
			System.out.println("1.Addition.");
			System.out.println("2.Multiplication.");
			System.out.println("3.Division.");
			System.out.println("4.Substraction.");
			System.out.println("5.Exit.");
			System.out.println("=============================");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1: 
					Value v = new Add();
					v.setValue(fno,sno);
					cal.performOperation(v);
					break;
					
				case 2:
					v = new Mul();
					v.setValue(fno,sno);
					cal.performOperation(v);
					break;
					
				case 3:
					v = new Div();
					v.setValue(fno,sno);
					cal.performOperation(v);
					break;
					
				case 4: 
					v = new Sub();
					v.setValue(fno,sno);
					cal.performOperation(v);
					break;
					
				case 5:
					System.out.println("\nExiting....");
					return;
					
				default: 
					System.out.println("\nWrong choice!Try again.");
			}
		}
		
	}
}