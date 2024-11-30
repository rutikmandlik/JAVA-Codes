import java.util.*;
class Medical
{
	private int id;
	private String name;
	private double price;
	private String type;
	private int tablet;
	private int expiryDate;
	private int qty;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void setTabletinStrip(int tablet)
	{
		this.tablet=tablet;
	}
	public int getTablet()
	{
		return tablet;
	}
	public void setExpiryDate(int expiryDate)
	{
		this.expiryDate=expiryDate;
	}
	public int getExpiryDate()
	{
		return expiryDate;
	}
	public void setQuantity(int qty)
	{
		this.qty=qty;
	}
	public int getQuantity()
	{
		return qty;
	}
}
public class MedicalApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double total = 0;
		Medical m[]=new Medical[3];
		for(int i=0;i<m.length;i++)
		{
			m[i]=new Medical();
			System.out.println("Enter Product Id: ");
			m[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Name: ");
			m[i].setName(sc.nextLine());
			System.out.println("Enter Price: ");
			m[i].setPrice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter Product Type: ");
			m[i].setType(sc.nextLine());
			System.out.println("Enter Tablet in Strip: ");
			m[i].setTabletinStrip(sc.nextInt());
			System.out.println("Enter Expiry Date: ");
			m[i].setExpiryDate(sc.nextInt());
			System.out.println("Enter Quantity: ");
			m[i].setQuantity(sc.nextInt());
			
		}
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getId()+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getType()+"\t"+m[i].getTablet()+"\t"+m[i].getExpiryDate()+"\t"+m[i].getQuantity());
		}
		for(int i=0;i<m.length;i++)
		{
			total += m[i].getPrice();
		}
		System.out.println("Products with Price in between 100-1000: ");
		for(int i=0;i<m.length;i++)
		{
			if(m[i].getPrice() >= 100 && m[i].getPrice() <= 1000)
			{
				System.out.println(m[i].getPrice());
			}
			
		}
		double totalBill = total * 0.18;
		System.out.println("Total Bill is: "+totalBill);
	}
}