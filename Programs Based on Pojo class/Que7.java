/*
7.WAP to create the class name as InsertArrayEle with a following methods 
class InsertArrEle
{  int c[];
   void setIntArray(int ch[])
   { //here accept the integer array and store in instance variable in integer array
     c=ch;
   }
   void insertValueOnIndex()
   { //here we need to write the manual logics for  inserting value on specified index in arr
   }
}
public class ConvertToUpperApp
{
   public static void main(String x[])
   {  //here create the array with 6 six size and store only five value in it using scanner
	 // create the object of InsertArrEle class
     //call the setIntArray function
     //call the insertValueOnIndex() and write the manual logics
   }
}
*/


class InsertArrEle
{
	int a[];
	void setIntArray(int a[])
	{
		this.a=a;
	}
	void insertValueOnIndex()
	{
		int index = 2;
		int value = 4000;
		
		for(int i = a.length-2;i>=index;i--)
		{
			a[i+1] = a[i];
		}
		a[index] = value;
		
	}
}
public class Que7
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter 5 inputs in array: ");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		System.out.println("Before");
		for(int i  = 0;i<arr.length;i++){
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
		
		InsertArrEle ia=new InsertArrEle();
		ia.setIntArray(arr);
		ia.insertValueOnIndex();
		
		System.out.println("After");
		for(int i  = 0;i<arr.length;i++){
			System.out.print("\t"+arr[i]);
		}
	}
}