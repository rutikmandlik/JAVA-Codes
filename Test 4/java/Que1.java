/*
Q1. Create a Product POJO with fields: productId, name, price, quantity, and category.
• Task:
1. Initialize details for 5 products using a constructor.
2. Add methods to:
▪ Update the stock (add or reduce quantity).
▪ Display products in a specific category.
▪ Find the product with the highest stock and display its details.
*/

import java.util.*;
class Product{
	private int id;
	private String name;
	private int price;
	private int qty;
	private String category;
	
	Product(int id,String name,int price,int qty,String category){
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.category=category;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
	public int getQty(){
		return qty;
	}
	public String getCategory(){
		return category;
	}
	
	void updateStock(int amount){
		if(qty + amount < 0){
			System.out.println("Not enough stock to reduce by " + amount + " units.");
		}
		else{
			qty += amount;
            System.out.println("Stock updated. Current quantity: " + qty);
		}
	}
	void displayDetails(){
		System.out.println("Product Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+qty);
		System.out.println("Category: "+category);
		System.out.println("=======================");
	}
}
public class Que1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=2;
		Product[] p1=new Product[size];
		System.out.println("Enter details of "+size+" products");
		for(int i=0;i<p1.length;i++){
			System.out.println("Product "+(i+1)+":");
			System.out.print("Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Price: ");
			int price=sc.nextInt();
			System.out.print("Quantity: ");
			int qty=sc.nextInt();
			sc.nextLine();
			System.out.print("Category: ");
			String category=sc.nextLine();
			
			p1[i]=new Product(id, name, price, qty, category);
		}
		
		// Operations menu
		while(true){
			System.out.println("\nMenu:");
            System.out.println("1. Update stock");
            System.out.println("2. Display products by category");
            System.out.println("3. Display product with the highest stock");
			System.out.println("4. Display all products.");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
			
			switch(choice){
				case 1: //update stock
					System.out.print("Enter product id to update: ");
					int pIdToUpdate=sc.nextInt();
					System.out.print("Enter quantity to add(or negative to reduce):  ");
					int qtyChange=sc.nextInt();
					
					boolean flag=false;
					for(int i=0;i<p1.length;i++){
						if(p1[i].getId() == pIdToUpdate){
							p1[i].updateStock(qtyChange);
							flag = true;
							break;
						}
					}
					if(!flag){
						System.out.println("Product not found.");
					}
					break;
				
				case 2:  // Display products by category
                    System.out.print("Enter category to search: ");
                    sc.nextLine(); 
                    String searchCategory = sc.nextLine();
                    System.out.println("Products in category: " + searchCategory);
                    for (int i=0;i<p1.length;i++) {
                        if (p1[i].getCategory().equalsIgnoreCase(searchCategory)) {
                            p1[i].displayDetails();
                        }
                    }
                    break;
				
				case 3: // Display product with the highest stock
                    Product highestStockProduct = p1[0];
                    for (int i=0;i<p1.length;i++) {
                        if (p1[i].getQty() > highestStockProduct.getQty()) {
                            highestStockProduct = p1[i];
                        }
                    }
                    System.out.println("Product with the highest stock:");
                    highestStockProduct.displayDetails();
                    break;
					
				case 4:
					for(int i=0;i<p1.length;i++){
						p1[i].displayDetails();
					}
					break;
				
				case 5:
					System.out.println("Exiting the program.");
					return;
					
				default:
					System.out.println("Invlid choice! Try Again.");
			}
		}
	}
}