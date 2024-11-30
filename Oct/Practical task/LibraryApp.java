import java.util.*;
class Library
{
   private int acsno;
   private String title;
   private String athrname;
   private int price;

   public void setAcsNo(int acsno){
	this.acsno=acsno;
   }
   public int getAcsNo(){
	return acsno;
   }
   public void setTitle(String title){
	this.title=title;
   }
   public String getTitle(){
	return title;
   }
   public void setAthrName(String athrname){
	this.athrname=athrname;
   }
   public String getAthrName(){
	return athrname;
   }
   public void setPrice(int price){
	this.price=price;
   }
   public int getPrice(){
	return price;
   }

	public String toString()
	{
	   return acsno+"\t"+title+"\t"+athrname+"\t"+price ;
	}
}
public class LibraryApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	Library li[]=new Library[3];
   	boolean exit = false;

	while( !exit ){
		System.out.println("Menu: ");
		System.out.println("1. Add Book Details.");
		System.out.println("2. Display All Book Details.");
		System.out.println("3. Display List of all book of given author.");
		System.out.println("4. Display the title of specified book.");
		System.out.println("5. Display the count of the book in the library.");
		System.out.println("6. Display books in the ascending order of accession number.");
		System.out.println("7. Update book details by title of book.");
		System.out.println("8. Delete book details by price.");
		System.out.println("9. Exit");
	
		System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		sc.nextLine();

		switch(choice){
			case 1:
				for(int i=0;i<li.length;i++)
				{
				   li[i]=new Library();
				   System.out.println("Enter Accession Number, Title, Author And Price of the Book: ");
				   System.out.print("Accession Number: ");
				   int acsno=sc.nextInt();
				   sc.nextLine();
				   li[i].setAcsNo(acsno);
				   
				   System.out.print("Title: ");
				   String title=sc.nextLine();
				   li[i].setTitle(title);
				   
				   
				   System.out.print("Author: ");
				   String athrname=sc.nextLine();
				   li[i].setAthrName(athrname);

				   System.out.print("Price: ");
				   int price=sc.nextInt();
				   li[i].setPrice(price);	
				}
				break;
			case 2:
				System.out.println("Displaying all book details: ");
				for(int i=0;i<li.length;i++)
				{
				   if(li[i] != null)
				   {
					System.out.println(li[i]);
				   }
				}
				break;
			case 3: 
				System.out.print("Enter author name: ");
				String authorname = sc.nextLine();
				for(int i=0;i<li.length;i++)
				{
				   if(li[i].getAthrName().equalsIgnoreCase(authorname))
				   {
				   	System.out.println(li[i]);
				   }
				}
				break;
			case 4:
				System.out.print("Enter Accession Number to display book title: ");
				int acsnoSearch=sc.nextInt();
				sc.nextLine();
				boolean found=false;
				for(int i=0;i<li.length;i++)
				{
				   if(li[i].getAcsNo() == acsnoSearch)
				   {
					System.out.println("Title of Book is: "+li[i].getTitle());
					found = true;
					break;
				   }
				}
				if(!found)
				{
				   System.out.println("Book Not Found.");
				}
				break;
			case 5: 
				System.out.println("Total count of the books in the library is: "+li.length);
				break;
			case 6: 
				for(int i=0;i<li.length;i++)
				{
				   for(int j=0;j<li.length - 1 - i ;j++)
				   {
					if(li[j].getAcsNo() > li[j+1].getAcsNo())
					{
					   Library temp = li[j];
					   li[j] = li[j+1];
					   li[j+1] = temp;
					}
				   }
				}
				System.out.println("Books sorted by accession number: ");
				for(int i=0;i<li.length;i++)
				{
				   System.out.println(li[i]);
				}
 				break;
			case 7:
				System.out.print("Enter Title of Book to update: ");
				String searchTitle=sc.nextLine();
				found = false;
				for(int i=0;i<li.length;i++)
				{
					if(li[i].getTitle().equalsIgnoreCase(searchTitle))
					{
						System.out.println("Enter new Details (Accession Number,Author,Price): ");
							li[i].setAcsNo(sc.nextInt());
							sc.nextLine();
							li[i].setAthrName(sc.nextLine());
							li[i].setPrice(sc.nextInt());
							found = true;
							break;
					}
				}
				if(!found)
				{
					System.out.println("Book Not Found");
				}
				break;
			case 8: 
				System.out.print("Enter Book Price to delete details: ");
				int delprice=sc.nextInt();
				
				for(int i=0;i<li.length;i++)
				{
					if(li[i].getPrice() == delprice)
					{
						li[i]=null;
						System.out.println("Book with price "+delprice+" deleted. ");
						break;
					}
				}
				break;
				
 			case 9:
				System.out.println("Exiting...");
				exit = true;
				break;
			default: 
				System.out.println("Invalid Choice! Please Try again.");
     		}
	}
   }
}