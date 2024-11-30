import java.util.*;
public class  TestCaseSix
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
        int friends,students,classroom;
        System.out.println("Enter Total numbers of friends");
        friends=sc.nextInt();
        System.out.println("Enter numbers of other students");
        students=sc.nextInt();
        System.out.println("Enter Total strength of Classroom");
        classroom=sc.nextInt();
  
        if(friends + students <= classroom)
 	{
 	     System.out.println("For all the friends it is possible to join the Course");
        }        
        else
  	{
 	     System.out.println("For all the friends it is NOT possible to join the Course");
 	}
     
   }
}