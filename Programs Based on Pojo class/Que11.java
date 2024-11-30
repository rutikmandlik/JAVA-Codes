/*
11).WAP to create the class name as Product with a following properties 
class Product
{  private int id;
    private String name;
    private int qty;
    private int rate;
   public void setId(int id)
    { this.id=id;
    }
  public int getId()
   { return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
  //write the setter getter
// for qty and rate
}
Create the another class name as CalculateBill and this class is depend on product but we want to pass more than one product details to CalculateBill class so here we use the var-args concept.
So your class look like as 
 
Then we need to write the class with a main method look like as 
 
Your output look like as :
 
*/

import java.util.*;
class Product{
	private int id;
    private String name;
    private int qty;
    private int rate;
   
	public void setId(int id)
    { this.id=id;
    }
	public int getId()
	{ return id;
	}
	public void setName(String name)
	{ this.name=name;
	}
	public String getName()
	{ return name;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{
		return rate;
	}
}
class CalculateBill{
	
	void calBill(Product ...p)
	{
		int sum = 0;
		System.out.println("PId\tPName\tQty\tRate\tTotalBill");
		for(int i=0;i<p.length;i++)
		{
			int totalBill=p[i].getQty()*p[i].getRate() ;
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t"+totalBill);
			sum += totalBill;
		}
		System.out.print("Total Bill of Order: "+sum);
	}
}
public class Que11
{
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Ram");
		p1.setQty(5);
		p1.setRate(10);
		
		Product p2=new Product();
		p2.setId(2);
		p2.setName("sham");
		p2.setQty(10);
		p2.setRate(10);
		
		Product p3=new Product();
		p3.setId(3);
		p3.setName("Bharat");
		p3.setQty(10);
		p3.setRate(10);
		
		CalculateBill cb=new CalculateBill();
		cb.calBill(p1,p2,p3);
	}
}