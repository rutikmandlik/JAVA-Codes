class Value{
	int a,b;
	void setValue(int x,int y){
		a=x;
		b=y;
	}
}
class Add extends Value{
	int getResult(){
		return a+b;
	}
}
class Mul extends Value{
	int getResult(){
		return a*b;
	}
}
class Calculator{
	void performOperation(Add ad){  //tight coupling
		int result = ad.getResult();
		
		System.out.printf("Addition is %d\n",result);
	}
	/*
	void performOperation(Mul m){    // this is function overloading
		int result = m.getResult();
		
		System.out.printf("Multiplication is %d\n",result);
	}
	*/
}
public class TightCoupling{
	public static void main(String args[]){
		Calculator c = new Calculator();
		Add ad1 = new Add();
		ad1.setValue(10,20);
		c.performOperation(ad1);
		
		/*
		We cannot pass reference of Mul in performOperation because we created reference 
		of Add in it so it's not possible. 
			Mul m = new Mul();
			m.setValue(5,4);
			c.performOperation(m);
		*/
	}
}