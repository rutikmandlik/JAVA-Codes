import java.util.*;
class Food
{
   private int fid;
   private String fname;
   private int fprice;
   private String fcategory;

   public void setId(int fid){
	this.fid=fid;
   }
   public int getId(){
 	return fid;
   }
   public void setName(String fname){
 	this.fname=fname;
   }
   public String getName(){
	return fname;
   }
   public void setPrice(int fprice){
	this.fprice=fprice;
   }
   public int getPrice(){
	return fprice;
   }
   public void setCategory(String fcategory){
	this.fcategory=fcategory;
   }
   public String getCategory(){
	return fcategory;
   }

	public String  toString(){
		System.out.println("ID\tName\tPrice\tCategory");
		return fid+"\t"+fname+"\t"+fprice+"\t"+fcategory;
			
	}
}
public class FoodApp
{
   public static void main(String args[])
   {
	Food f1[]=new Food[3];
	Scanner sc=new Scanner(System.in);
	boolean exit = false ;
	
   while(!exit)
	{
	System.out.println("\nMenu: ");
	System.out.println("1 : Add All Food details.");
	System.out.println("2 : Display All Food details.");
	System.out.println("3 : Display food details whose price range between 500 to 1000.");
	System.out.println("4 : Search Food  details using by id.");
	System.out.println("5 : Update Food  details using by name.");
	System.out.println("6 : Delete Food details using by price.");
	System.out.println("7 : Purchase Food Items.");
	System.out.println("8 : Display Bill Details :");
	System.out.println("9 : Display Food Details Start first letter is 'P' and ends with 'A'.");
	System.out.println("10: To Exit");

	System.out.print("Enter Your Choice: ");
	int choice=sc.nextInt();
	sc.nextLine();  //clear newline character
	
	switch(choice) 
	{
	case 1:
		
  		for(int i=0;i<f1.length;i++)
 		{
	   	   f1[i]=new Food();
	   	   System.out.println("Enter Id , Name , Price , and Category of Food: ");
	   	   int id=sc.nextInt();
	   	   sc.nextLine();
	   	   String name=sc.nextLine();
	  	   int price=sc.nextInt();
	   	   sc.nextLine();
	    	   String category=sc.nextLine();

	   	   f1[i].setId(id);
	   	   f1[i].setName(name);
	   	   f1[i].setPrice(price);
	   	   f1[i].setCategory(category);
		}
		break;
	case 2:
		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i] != null)
			System.out.println(f1[i]);
		}
		break;
	case 3:
		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i].getPrice() >= 500 && f1[i].getPrice() <= 1000)
		   {
			System.out.println(f1[i]);
		   }
		}
		break;
	case 4: 
		System.out.println("Enter food id to search: ");
		int skey=sc.nextInt();
		boolean found=false;
		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i].getId() == skey)
		   {
		   	System.out.println(f1[i]);
		   	found = true;
		   	break;
		   }
		}
		if(!found)
		{
		   System.out.println("Food not found");
		}
		break;
	case 5: 
		System.out.println("Enter Food name to update: ");
		String searchName=sc.nextLine();
		found = false;
		
		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i].getName().equalsIgnoreCase(searchName))
		   {
			System.out.println("Enter new details (Id, Price, Category):");
                            f1[i].setId(sc.nextInt());
                            sc.nextLine(); 
                            f1[i].setPrice(sc.nextInt());
                            sc.nextLine(); 
                            f1[i].setCategory(sc.nextLine());
                            found = true;
                            break;
		   }
		}
		if (!found) {
                    System.out.println("Food not found.");
                }
                break;
	case 6:
		System.out.print("Enter price to delete food: ");
		int delPrice=sc.nextInt();

		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i].getPrice() == delPrice)
		   {
			f1[i]=null;
			System.out.println("Food with price "+delPrice+" deleted.");
			break;
		   }
		}
		break;
	case 7:
		System.out.println("Purchasing all available Foods....");
		break;
	case 8:
		System.out.println("1: Bill Without GST \n 2: Bill With GST");
		int billchoice=sc.nextInt();
		double total = 0;
		
		for(int i=0;i<f1.length;i++)
		{
		   if(f1[i] != null)
			total += f1[i].getPrice();
		}
		if(billchoice == 2)
		{
			total += total * 0.18;
			System.out.println("Bill With GST: "+total);
		}
		else
		{
			System.out.println("Bill Without GST: "+total);
		}
		break;
	case 9:
		for(int i=0;i<f1.length;i++)
		{
			if(f1[i].getName().startsWith("P") && f1[i].getName().endsWith("A")  || 
			   f1[i].getName().startsWith("p") && f1[i].getName().endsWith("a"))
			{
			   System.out.println(f1[i]);
			}
		}
		break;
	case 10:
		System.out.println("Exiting...");
		
		exit = true;

		break;
	default: 
		System.out.println("Invalid Choice! Try again");
	}
	}	
   }
}