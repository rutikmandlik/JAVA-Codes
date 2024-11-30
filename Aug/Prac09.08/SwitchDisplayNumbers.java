import java.util.*;
public class SwitchDisplayNumbers
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,choice;

	System.out.println("choice 1 : To print 1 to nth Prime Number");
	System.out.println("choice 2 : To print 1 to nth perfect Number");
	System.out.println("choice 3 : To print 1 to nth Duck Number");
	System.out.println("choice 4 : To print 1 to nth Strong Number");
	System.out.println("choice 5 : To print 1 to nth Armstrong Number");
	System.out.println("Enter a Choice: ");
	choice=sc.nextInt();

	switch(choice)
	{
		case 1: int i=2;
			System.out.println("Enter a nth Number: ");
		        no=sc.nextInt();
			while(i<=no)
			{
				int j=2;
				boolean flag = true;
				while(j <= Math.sqrt(i))
				{
				   if(i % j == 0)
				   {
				      flag = false;
				      break;
				   }
				   j++;
				}
				if(flag)
				{
				   System.out.println("The Prime Numbers are: "+i);
				   
				}
				i++;			   
			}
			
			
			break;
		
		case 2: System.out.println("Enter a nth Number:");
		        no=sc.nextInt();
			int perfectCount = 0;
			int num = 1 ;
			while(perfectCount < no)
			{
			   int sum = 0;
			   int k = 1;
			   while(k <= num/2)
			   {
				if(num % k == 0)
				{
				   sum=sum + k;
				}
				k++;
			   }
			   if(sum == num)
			   
				System.out.println(num);
				perfectCount++;
			   
			   num++;
			}
			break;

		case 3: 
			System.out.println("Enter a nth Number:");
			no=sc.nextInt();
			int duckCount = 0;
			int duckNum = 1;
			while(duckCount < no)
			{
			   int temp = duckNum;
			   boolean flag= false;
			   while(temp > 0)
			   {
				if(temp % 10 == 0 && duckNum > 9)
				{
				   flag = true;
				   break;
				}
				temp= temp/10;
			   }
			   if(flag)
			   
				System.out.print(duckNum+" ");
				duckCount++;
			   
			   duckNum++;
			}
			break;

		case 4:
			System.out.println("Enter a nth Number: ");
			no=sc.nextInt();
			int strongCount = 0;
			int strongNum = 1;
			while(strongCount < no)
			{
			   int temp = strongNum;
			   int sum=0;
			   if(temp > 0)
			   {
				int fact= 1;
				int digit= temp % 10;
				int l = 1;
				while(l <= digit)
				{
				   fact=fact*l;
				   l++;
				}
				sum=sum + fact;
				temp=temp/10;
			   }
			   if(sum == strongNum)
			   
				System.out.print(strongNum+" ");
				strongCount++;
			   
			   strongNum++;
			}
			break;
			 
		case 5:
			System.out.println("Enter a nth Number: ");
			no=sc.nextInt();
			int armstrongCount = 0;
                	int armstrongNum = 1;
			while(armstrongCount < no)
			{
			   int temp= armstrongNum;
			   int sum= 0;

			   // Calculate the number of digits
                           int digits = 0;
      			   int tempDigits = armstrongNum;
        		   while (tempDigits > 0) 
			   {
            		      tempDigits= tempDigits / 10;
             		      digits++;
        		   }
			  
			   //Check if it's an Armstrong number

			   temp = armstrongNum;
			   while (temp > 0) 
			   {
            		       	int d = temp % 10;
            			sum += Math.pow(d, digits);
            			temp= temp/ 10;
        		   }
			   if(sum == armstrongNum)
			
				System.out.print(armstrongNum+" ");
				armstrongCount++;

			   armstrongNum++;
			}
			break;
		
		default :System.out.println("Wrong Choice");
			
	}
   }
}
