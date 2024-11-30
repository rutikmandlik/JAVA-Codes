import java.util.*;
public class AreaOfEquilateralTriangle
{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the side of triangle:");
         double a=s.nextDouble();
         double area=(Math.sqrt(3)/4)*(a*a);
         System.out.println("\nArea of Triangle:"+area);
    }
}