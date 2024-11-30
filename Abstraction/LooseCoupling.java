abstract class Value{
	int a,b;
	void setValue(int x,int y){
		a=x;
		b=y;
	}
	abstract int getResult();
}
class Add extends Value{
	int getResult(){
		return a + b;
	}
}
class Mul extends Value{
	int getResult(){
		return a * b;
	}
}
class Calculator{
	void performOperation(Value v,String operationType)
	{
		int result=v.getResult();
		System.out.println(operationType+"is "+result);
	}
}
public class LooseCoupling{
	public static void main(String args[]){
		Calculator c = new Calculator();
		
		Value v = null;
		v = new Add();
		v.setValue(10,20);
		c.performOperation(v,"Addition");  //call version of Add class
		
		v = new Mul();
		v.setValue(5,4);
		c.performOperation(v,"Multiplication");   //call version of Mul m
	}
}
