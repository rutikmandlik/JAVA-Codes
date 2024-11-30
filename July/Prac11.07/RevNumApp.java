import java.util.*;
public class RevNumApp
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int no,rem,sum=0,rev=0;
       System.out.println("Enter 5 digit number");
       no=s.nextInt();
	
       
      /* rem=no%10;
       no=no/10;
       rev=rev*10+rem;
       sum=sum+rem;

       rem=no%10;
       no=no/10;
       rev=rev*10+rem;
       sum=sum+rem;
 
       rem=no%10;
       no=no/10;
       rev=rev*10+rem;       
       sum=sum+rem; */
  
       //for 3 digit number
       //rev=(no%10)*100+((no/10)%10)*10+no/100;
       //sum=(no%10)+((no/10)%10)+(no/100);

       //for 5 digit number
       rev=(no%10)*10000+((no/10)%10)*1000+((no/100)%10)*100+((no/1000)%10)*10 + no/10000;
       sum=(no%10)+((no/10)%10)+((no/100)%10)+((no/1000)%10)+(no/10000);

       //System.out.println("Number is:"+no);
       System.out.println("Sum is: "+sum);
       //System.out.println("Reminder is:"+rem);
       System.out.println("Reverse Number is:"+rev);
   }
}