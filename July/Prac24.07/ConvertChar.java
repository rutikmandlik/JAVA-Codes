//Convert a Character into capital to small & Small to Capital using Bitwise Operator.

import java.util.*;
public class ConvertChar
{
   public static void main(String args[])
   {
      Scanner scanner=new Scanner(System.in);
      char inputChar;
      System.out.print("Enter a Character: ");
      inputChar=scanner.next().charAt(0);

      char res=(ch^=32);
      System.out.print("The Conversion is: "+res);

      /*// Using XOR bitwise operator to toggle case 
        char toggledCharXOR = (char) (inputChar ^ 32); 
        System.out.println("\nUsing XOR operator: "+toggledCharXOR);

        // Using OR and AND bitwise operators 
        char convertedChar=(inputChar >= 'A' && inputChar <= 'Z')? (char)(inputChar | 32) : (char)(inputChar & ~32); 
        System.out.println("Using OR and AND operators: " + convertedChar);

        // Using bitwise NOT and AND operators 
        char toggledCharNOT = (char)((inputChar >= 'A' && inputChar <= 'Z')? ~(~inputChar | 32) : ~(~inputChar &~32)); 
        System.out.println("Using NOT and AND operators: " + toggledCharNOT):

        // Using bitwise AND to convert uppercase to lowercase 
        char upperToLower = (char)(inputChar | 32);
        System.out.println("Uppercase to lowercase using OR operator: " + upperToLower);

        // Using bitwise AND to convert lowercase to uppercase 
        char lowerToUpper=(char)(inputChar & ~32); 
        System.out.println("Lowercase to uppercase using AND operator: " + lowerToUpper);*/

      
   }
}