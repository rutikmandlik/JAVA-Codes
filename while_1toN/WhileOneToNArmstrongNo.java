import java.util.*;
public class WhileOneToNArmstrongNo
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nth Number: ");
	int no=sc.nextInt();
	int Count = 0;
        int Num = 1;
	while(Count < no)
	{
	   int temp=Num;
	   int sum= 0;

	 // Calculate the number of digits
           int digits = 0;
      	   int tempDigit=Num;
           while (tempDigit > 0) 
	   {
              tempDigit= tempDigit / 10;
              digits++;
       	   }
			  
	   //Check if it's an Armstrong number

	   temp = Num;
	   while (temp > 0) 
	   {
              int d = temp % 10;
              sum += Math.pow(d, digits);
              temp= temp/ 10;
           }
	    if(sum == Num)
			
		System.out.print(Num+" ");
		Count++;

	    Num++;
 	}
   }
}