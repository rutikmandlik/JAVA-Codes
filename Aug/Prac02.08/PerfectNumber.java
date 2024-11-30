//perfect number means After adding Factors of number then sum=number or sum=2*number then it is Perfect Number 
//ex. 1+2+3=6 , 1+2+3+6=12

import java.util.*;
public class PerfectNumber
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int i=1,sum=0,no;    
	System.out.println("Enter a Number: ");
	no=sc.nextInt();   //no=6

	while(i<no)      //for 6
	//while(i<=no)   //for 12    It is also Acceptable  
	{
	   if(no % i == 0)
	   {
		sum=sum+i;
	   }
	   i++;
	}
	if(sum==no)         //for 6
	//if(sum==2 * no)   //for 12    It is also Acceptable
	{
	   System.out.println("Number is Perfect");
	}
	else
	{
	   System.out.println("Number is Not Perfect");
	}
   }
}