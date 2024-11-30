import java.util.*;
public class PowerApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int base,index;
	System.out.println("Enter Base & Index: ");
	base=sc.nextInt();
	index=sc.nextInt();
	showPower(base,index);        //calling
	
   }
   public static void showPower(int base,int index)     //definition 
   {
	int p=1;
	for(int i=1;i<=index;i++)
	{
	   p=p*base;
	}
	System.out.printf("\nPower is %d\n",p);
   }  
}