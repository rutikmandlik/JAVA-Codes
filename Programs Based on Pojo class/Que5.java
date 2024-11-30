/*
5.WAP program create the class name as Sum with a following methods 
class Sum
{ void calSum(int ...x) //method with var-args
    {//here we need to calculate the sum of all elements
    }
}
public class SumApplication
 {  public static void main(String x[])
   {//here we need to create the object of Sum class and call the calSum() method and pass 
     //parameter in it 
   }
}
*/

class Sum
{
	void calSum(int ...x)
	{
		int sum =0 ;
		for(int i=0;i<x.length;i++)
		{
			sum += x[i];
		}
		System.out.println("Sum is: "+sum);
	}
}
public class Que5
{
	public static void main(String args[])
	{
		Sum s1=new Sum();
		s1.calSum(10,20,30,40,50);
	}
}