import java.util.*;
public class IfElectricityBill
{
    public static void main(String args[])
    {
 	Scanner sc=new Scanner(System.in);
        double unit,x,bill,unit1;
        System.out.println("Enter Bill Unit");
 	unit=sc.nextDouble();
 
        /*if(unit>0 && unit<=50)
 	{
	    x=(unit*0.50)+(unit*0.2);
 	    System.out.print("Final Bill is "+x +" Rs.");
 	}
 	else if(unit>50 && unit<=150)
 	{
 	    x=(unit*0.75)+(unit*0.2)+25;
            System.out.print("Final Bill is "+x +" Rs.");
 	}
 	else if(unit>150 && unit<=250)
 	{
   	    x=(unit*1.20)+(unit*0.2);
 	    System.out.print("Final Bill is "+x +" Rs.");
 	}
 	else if(unit>250)
 	{
 	    x=(unit*1.50)+(unit*0.2);
 	    System.out.print("Final Bill is "+x +" Rs.");
 	}*/

 	if(unit<=50)
 	{
 	   bill=unit*0.5;
           x=bill+(bill*0.2);
 	   System.out.println("Total Bill is "+x);
 	}
 	else if(unit<=150)
 	{
 	  unit1=unit-50;
          bill=25+(unit1*0.75);
          x=bill+(bill*0.2);
          System.out.println("Total Bill is rs."+x);

 	}
 	else if(unit<=250)
 	{
	   unit1=unit-150;
 	   bill=25+75+(unit1*1.20);
 	   x=bill+(bill*0.2);
           System.out.println("Total Bill is rs."+x);
 	}
 	else if(unit>250)
 	{
 	   unit1=unit-250;
  	   bill=25+75+120+(unit1*1.5);
           x=bill+(bill*0.2);
 	   System.out.println("Total Bill is rs."+x);
 	}
    }
}