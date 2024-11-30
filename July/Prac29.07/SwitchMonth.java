import java.util.*;
public class SwitchMonth
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter Month Number: ");
  	choice=sc.nextInt();

  	switch(choice)
 	{
 		case 1: System.out.println("January \n Number of Days 31");
 		        break;
 		case 2: System.out.println("February \n Number of Days 28");
 			break;
 		case 3: System.out.println("March \n Number of Days 31");
 			break;
 		case 4: System.out.println("April \n Number of Days 30");
 			break;
 	 	case 5: System.out.println("May \n Number of Days 31");
 			break;
 		case 6: System.out.println("June \n Number of Days 30");
 			break;
 		case 7: System.out.println("July \n Number of Days 31");
 			break;
 	 	case 8: System.out.println("August \n Number of Days 31");
 			break;
 		case 9: System.out.println("September \n Number of Days 30");
 		 	break;
 		case 10:System.out.println("October \n Number of Days 31");
 			break;
 		case 11:System.out.println("November \n Number of Days 30");
 			break;
 		case 12:System.out.println("December \n Number of Days 31");
  		 	break;
    		default:System.out.println("Wrong Choice");
 	}
   }
}