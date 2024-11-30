import java.util.*;
class Product
{ 
    private int id;
    private String name;
    private int qty;
    private int rate;
 
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
class CalculateBill
{
    
    void calBill(Product ...products)
    {
        int TotalBill = 0;
        for(int i=0;i<products.length;i++)
        {
            TotalBill += products[i].getQty() * products[i].getRate();
        }
        System.out.println("Total Bill is: "+TotalBill);
        
    }
}
public class BillingApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int productCount = sc.nextInt();
        Product products[] = new Product[productCount];
        for (int i = 0; i < productCount; i++) 
        {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name of Product: ");
            String name=sc.nextLine();
            System.out.print("Enter Quantity: ");
            int qty=sc.nextInt();
            System.out.print("Enter Rate: ");
            int rate=sc.nextInt();

            Product pp=new Product();
            pp.setId(id);
            pp.setName(name);
            pp.setQty(qty);
            pp.setRate(rate);

            products[i] = pp;

        } 

        CalculateBill cb=new CalculateBill();
        cb.calBill(products);
    }
}