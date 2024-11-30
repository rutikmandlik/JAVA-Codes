import java.util.*;
public class DigitAddApp
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int no,D;
     System.out.println("Enter 3 digit no:");
     no=sc.nextInt();
     
     D=(no%10)+((no/10)%10)+(no/100);
     System.out.println("Digit Adiition is:"+D);
    }
}0