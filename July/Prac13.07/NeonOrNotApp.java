import java.util.*;
public class NeonOrNotApp
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int no,sqr,num,sum=0;
       System.out.print("Enter the Number:");
       no=sc.nextInt();   //5
           
       sqr=no*no;    //5*5=25
       System.out.printf("Square is: %d\n",sqr);
       num=sqr%10;   //25%10=5
       sum=sum+num;  //0+5=5
       num=sqr/10;   //25/10=2
       sum=sum+num;  //5+2=7
  
       String ab=(no==sum)? "It is a Neon Number" : "Not a Neon Number" ;
       System.out.print(ab);
       
       System.out.println("\nSum of Digit is: "+sum);
    }
}
