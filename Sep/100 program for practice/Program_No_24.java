import java.util.*;
public class Program_No_24
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	
	// Cost per square foot for painting
        final double INTERIOR_COST = 18.0;
        final double EXTERIOR_COST = 12.0;

	System.out.print("Enter No. of Interior Walls: ");
	int IW=sc.nextInt();
	
	System.out.print("Enter No. of Exterior Walls: ");
	int EW=sc.nextInt();
	
	// Variable to store total surface area for interior and exterior walls
        double totalInteriorArea = 0;
        double totalExteriorArea = 0;
	
	if(IW > 0)
	{
	   System.out.println("Enter the surface area of each Interior wall: ");
	   for(int i=0;i<IW;i++)
	   {
		totalInteriorArea += sc.nextDouble();
	   }
	}
	if(EW > 0)
	{
	   System.out.println("Enter the surface area of each Exterior wall: ");
	   for(int i=0;i<EW;i++)
	   {
		totalExteriorArea += sc.nextDouble();
	   }
	}

	double totalCost = (totalInteriorArea * INTERIOR_COST) + (totalExteriorArea * EXTERIOR_COST);

	System.out.printf("Total estimated Cost: %.1f INR%n", totalCost);
   }
}