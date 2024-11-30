/*
9.WAP to create the class name as Seller with a following functions
class Seller
{
   void acceptSellingCostPrice(int sp,int cp)
   { //here we need to store the sp and sp values in instance variable
   }
   void showProfitLoss()
   { //here we need to write the logics for profit and loss
   }
}
class SellerApp{
    public static void main(String x[])
    {  //here we need to create the object of Scanner class 
       //declare the two values sp and cp and store values in it using scanner
      //create the object of Seller class
      //call its acceptSellingCostPrice function and pass two values in it
      //call the showProfitLoss() function
    }
}
*/

import java.util.*;
class Seller{
	int sp;
	int cp;
	void acceptSellingCostPrice(int sp,int cp){
		this.sp=sp;
		this.cp=cp;
	}
	void showProfitLoss(){
		if(cp < sp){
			System.out.println("Seller Make Profit.");
		}
		else{
			System.out.println("Seller Make Loss.");
		}
	}
}
public class Que9
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Cost price of product.");
		int cp=scn.nextInt();
		System.out.println("Enter Selling price of product.");
		int sp=scn.nextInt();
		
		Seller slr=new Seller();
		slr.acceptSellingCostPrice(sp,cp);
		slr.showProfitLoss();
	}
}