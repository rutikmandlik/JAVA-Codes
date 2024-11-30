import java.util.*;
public class QuadrantApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int x,y;
      System.out.println("Enter any two Co-ordinates:");
      x=sc.nextInt();
      y=sc.nextInt();
   
      String res=(x>0 && y>0)? "Co-ordinates lie in I st Quadrant" :
                 (x<0 && y>0)? "Co-ordinates lie in II nd Quadrant" :
                 (x<0 && y<0)? "Co-ordinates lie in III rd Quadrant" :
                 (x>0 && y<0)? "Co-ordinates lie in IV th Quadrant" :
                                "Something else " ; 
     System.out.print(res);
   }
}