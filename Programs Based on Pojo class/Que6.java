/*
6. create the class name as ConvertToUpper with a following methods
class ConvertToUpper
{  char c[];
   void setCharArray(char ch[])
   { //here accept the character array and store in instance variable in character array
     c=ch;
   }
   void convertToUpperCase()
   { //here we need to write the manual logics for converting lower case array
	//to upper case
   }
}
public class ConvertToUpperApp
{
   public static void main(String x[])
   {   //here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
	  //here create the object of ConvertToUpper class 
     //call setCharArray() function and pass ch array in setCharArray() function
    //call convertToUpperCase() function and see the result
   }
}
*/

class ConvertToUpper
{
	char c[];
	void setCharArray(char []ch)
	{
		c=ch;
	}
	void convertToUpperCase()
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>= 97 && c[i]<=122)
			{
				c[i] -= 32;
			}
		}
		
		System.out.println("Converted array is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
public class Que6
{
	public static void main(String args[])
	{
		char ch[]=new char[]{'g','o','o','d'};
		ConvertToUpper ctu=new ConvertToUpper();
		
		ctu.setCharArray(ch);
		ctu.convertToUpperCase();
	}
}