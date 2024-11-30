/*
create class name as ArrayOperation with function name as setArray() and create its 
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
public class Task3
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//int arr[]=new int[]{1,2,3,5,1,5,20,2,12,10};
		int []arr=new int[5];
		
		System.out.println("Enter 5 inputs: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length;j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.print(arr[i]+" ");
			}
		}
	}
}