import  java.util.*;
public class PrimeApp
{    public static void main(String x[])
     {  Scanner xyz  = new Scanner(System.in);
          int no,rem,i;
    boolean  flag=true;
     System.out.println("Enter number");
     no = xyz.nextInt(); //2
      i=2;
      while( i < no)  
      {
               rem  =no % i;    
               if(rem == 0)
                { flag=false;
                   break;
               }
           i++;
       }
    if(flag){
               System.out.println("Number is prime");
     } 
     else
       {
                 System.out.println("Number is not prime");
      }
     }
}
