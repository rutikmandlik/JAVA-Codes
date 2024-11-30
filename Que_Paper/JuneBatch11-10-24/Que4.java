/*
Write a java program using constructor overloading with class name as ArrayCons.
ArrayCons (int a [],int value): this constructor is used for accept array as parameter and 
pass value and search value in array.
ArrayCons(int a[]): this function will accept array as parameter and find maximum value 
from array
*/

import java.util.*;
class ArrayCons{
	ArrayCons(int a[],int value){
		boolean flag = false;
		for(int i=0;i<a.length;i++){
			if(a[i]==value){
				flag = true;
			}
		}
		if(flag){
			System.out.println("Search value "+value+" is found.");
		}
		else{
			System.out.println("Search value is not found.");
		}
	}
	ArrayCons(int a[]){
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i] > max){
				max=a[i];
			}
		}
		System.out.print("Maximum value from array is: "+max);
	}
}
public class Que4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 values in array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a value which you want to find: ");
		int skey=sc.nextInt();
		
		ArrayCons ac1=new ArrayCons(arr,skey);
		
		ArrayCons ac2=new ArrayCons(arr);
	}
}