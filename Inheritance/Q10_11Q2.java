/*. WAP to create class name as TestArr with method 
void acceptArray(int a[],int b[]) : this method can accept array as parameter 
we have three child classes name as Union with method 
void findUnionOfArray():this method can find the union of two array and display 
and we have one more child name as Intersection with method 
void findInetersection() this method can find the intersection of array and display it and 
we have third MergeArray with method 
void mergeArray(): this method can merge two array and display it.
*/

import java.util.*;
class TestArr
{
	int a[];
	int b[];
	void acceptArray(int a[],int b[]){
		this.a=a;
		this.b=b;
	}
}
class Union extends TestArr{
	void findUnionOfArray(){
		int unionArr[]=new int[a.length + b.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			unionArr[k++]=a[i];
		}
		
		for(int i=0;i<b.length;i++){
			boolean flag = false;
			for(int j=0;j<a.length;j++){
				if(a[j] == b[i]){
					flag = true;
					break;
				}
			}
			if(!flag){
				unionArr[k++]=b[i];
			}
		}
		
		System.out.println("Union of array is: ");
		for(int i=0;i<k;i++){
			System.out.print(unionArr[i]+" ");
		}
	}
}
class Intersection extends TestArr{
	void findInetersection(){
		System.out.println("\nIntersection elements are: ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}
}
class MergeArray extends TestArr{
	void mergeArray(){
		int c[]=new int[a.length + b.length];
		int j = 0;
		for(int i=0;i<a.length;i++){
			c[j++]=a[i];
		}
		for(int i=0;i<b.length;i++){
			c[j++]=b[i];
		}
		
		System.out.println("\nMerged array is: ");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}
public class Q10_11Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1[]=new int[5];
		System.out.println("Enter 5 elements in 1st array: ");
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		int a2[]=new int[5];
		System.out.println("Enter 5 elementsin 2nd array: ");
		for(int i=0;i<a2.length;i++){
			a2[i]=sc.nextInt();
		}
		
		Union u=new Union();
		u.acceptArray(a1,a2);
		u.findUnionOfArray();
		
		Intersection i1=new Intersection();
		i1.acceptArray(a1,a2);
		i1.findInetersection();
		
		MergeArray ma=new MergeArray();
		ma.acceptArray(a1,a2);
		ma.mergeArray();
	}
}