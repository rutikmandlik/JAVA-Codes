/*
Q. Write a Program to create abstract class name as Num with two methods 
void setNum(int no): this is the non abstract method which accept number as parameter 
abstract int getResult(): this is the abstract method can use for perform different operation on number
You have to create two child classes name as RevNumber and override the getResult() method and reverse 
the number and return it and you have to create class name as CountDigit   and override getResult() method
 in it and count the number of digit and return  its count 

*/

import java.util.*;
abstract class Num{
	int no;
	void setNum(int no){
		this.no=no;
	}
	abstract int getResult();
}
class RevNumber extends Num{
	int getResult(){
		int temp = no;
		int rem = 0, rev = 0;
		while(temp != 0){
			rem = temp % 10;
			temp /= 10;
			rev = rev * 10 + rem;
		}
		return rev;
	}
}
class CountDigit extends Num{
	int getResult(){
		int count = 0;
		while(no != 0){
			no /= 10;
			count++;
		}
		return count;
	}
}
public class Q1_16_11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no=sc.nextInt();
		
		RevNumber rn=new RevNumber();
		rn.setNum(no);
		System.out.println("Reverse Number is: "+rn.getResult());
		
		CountDigit cd=new CountDigit();
		cd.setNum(no);
		System.out.println("number of digit are: "+cd.getResult());
	}
}