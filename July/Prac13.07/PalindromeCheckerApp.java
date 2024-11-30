import java.util.*;
public class PalindromeCheckerApp
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);     
     System.out.print("Enter the Number: ");
     int no,temp,rev=0,cs;
     no=sc.nextInt();
     cs=no;
  
     temp=no%10;        //121%10=   1
     rev=rev*10+temp;   //0*10+1=   1
     no=no/10;          //121/10=   12
     
     temp=no%10;        //12%10=    2
     rev=rev*10+temp;   //1*10+2=   12
     no=no/10;          //12/10=    1
   
     temp=no%10;        //1%10=     1
     rev=rev*10+temp;   //12*10+1=  121
     no=no/10;          //1/10=     0
  
     String A=(rev==cs)? "It's a Palindrome" : "It's Not a Palindrome" ;
     System.out.print(A);   
  }

}