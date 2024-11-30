import java.util.*;
public class Program_No_29
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a large number: ");
	long number = sc.nextLong();         // Using 'long' to handle large numbers up to 100 digits
        
        int oddSum = 0;
        int evenSum = 0;
        int position = 1;               // Position starts from 1 for the rightmost digit
        
        
        while (number > 0) 
	{
            int digit = (int) (number % 10); // Extract the last digit
            
            if (position % 2 == 1) 
	    {
                oddSum += digit;
            }
	    else 
	    {
                evenSum += digit;
            }
            
            number /= 10;                  // Remove the last digit
            position++;                        // Move to the next position
        }
      
        System.out.println(Math.abs(evenSum - oddSum));
   }
}