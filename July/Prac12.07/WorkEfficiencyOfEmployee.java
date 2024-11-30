import java.util.*;
public class WorkEfficiencyOfEmployee
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Time Taken to Complete Work: "  );
      float T=sc.nextFloat();
      
      String res=(T>=2 && T<=3)? "Highly Efficient" :
                 (T>=3 && T<=4)? "Ordered to Improve Work " :
                 (T>=4 && T<=5)? "Give training to Improve Speed" :
                 (T>5)? "Empoyee Should Leave the Company" : "Very Talented ";
     System.out.print(res);
   }

} 