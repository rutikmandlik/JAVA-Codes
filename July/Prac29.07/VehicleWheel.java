import java.util.*;
public class VehicleWheel
{
   public static void main(String args[])
   {
   	Scanner sc=new Scanner(System.in);
        int v,w;
        System.out.println("Enter Number of vehicles: ");
        v=sc.nextInt();
 	System.out.println("Enter Number of Wheels: ");
 	w=sc.nextInt();

        if(w < 2 || w % 2 != 0 || v >= w)
     	{
 	    System.out.println("INVALID INPUT");
   	}
 	else
 	{
            
            int FW = (w - 2 * v) / 2;   // Calculate the number of four-wheelers (FW)
            
            int TW = v - FW;            // Calculate the number of two-wheelers (TW)


            
            if (FW < 0 || TW < 0)       // Check if the calculated values are valid
    	    {
                System.out.println("INVALID INPUT");
            } 
            else 
     	    {
                System.out.println("TW = " + TW + " FW = " + FW);
            }
        }
   }
}