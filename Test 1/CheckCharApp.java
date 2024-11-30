import java.util.*;
public class CheckCharApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("Enter any Character: ");
	ch=sc.next().charAt(0);        //take input in char

	
	if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')    //to check it is a Alphabet or not
	{
	   System.out.print("It is a Alphabet");
	}
	else if(ch>='0' && ch<='9')                    //to check it is a Digit or Not
	{
	   System.out.println("It is a Digit");
	}
	else                                          //to ensure it is a special Character
	{
	   System.out.println("It is a Special Character");
	}
   }
}