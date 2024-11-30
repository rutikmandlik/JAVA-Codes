/*
Q3. create class name as ArrayOperation with function name as setArray() and create its 
Two child classes name as Unique , MergeArray. We need to inherit the ArrayOperation 
class in Unique , MergeArray and create function and write the logic.
1. Unique Class : -
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
Output : All unique elements in the array are: 3, 20, 12, 10 
 
2. MergeArray class :-
Input -First Array :- 1 2 3 4 5
 Second Array :- 6 7 8 9 10 
Output - 1 10 2 9 3 8 4 7 5 6

*/

import java.util.*;
class ArrayOperation{
	int uarr[];
	int a1[];
	int a2[];
	void setArray(int uarr[],int a1[],int a2[]){
		this.uarr=uarr;
		this.a1=a1;
		this.a2=a2;
	}
}
class Unique extends ArrayOperation{
	void getUniqueEle(){
		for(int i=0;i<uarr.length;i++){
			int count = 0;
			for(int j=0;j<uarr.length;j++){
				if(uarr[i] == uarr[j])
					count++;
			}
			if(count == 1)
			System.out.print(uarr[i]+" ");
		}
	}
}
class MergeArray extends ArrayOperation{
	void getMerge(){
		int marray[]=new int[a1.length + a2.length];
		int left=0;
		int right=a2.length-1;
		int index = 0;
		while(left < a1.length && right >=0){
			marray[index++]=a1[left++];                  // Alternate elements from a1 and reversed a2 into marray
			marray[index++]=a2[right--];
		}
		
		for(int i=0;i<marray.length;i++){
			System.out.print(marray[i]+" ");
		}
	}
}
public class Que3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int uarr[]=new int[]{1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
		//System.out.println("Enter 10 inputs in array: ");
		//for(int i=0;i<uarr.length;i++){
			//uarr[i]=sc.nextInt();
		//}
		int a1[]=new int[]{1,2,3,4,5};
		int a2[]=new int[]{6,7,8,9,10};
		//System.out.println("Enter 5 input in 2nd array for merging: ");
		//for(int i=0;i<a2.length;i++){
		//	a2[i]=sc.nextInt();
		//}
		
		Unique u=new Unique();
		u.setArray(uarr,a1,a2);
		System.out.println("Unique elements are: ");
		u.getUniqueEle();
		
		MergeArray ma=new MergeArray();
		ma.setArray(uarr,a1,a2);
		System.out.println("\nMerged array is: ");
		ma.getMerge();
	}
}