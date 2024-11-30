import java.util.*;
class ArrParent{
	int a[];
	void setArray(int a[]){
		this.a=a;
	}
}
class Sort extends ArrParent{
	int [] getSortedArray(){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
class Max extends ArrParent{
	int getMax(){
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}
}
class Min extends ArrParent{
	int getMin(){
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < min){
				min = a[i];
			}
		}
		return min;
	}
}
public class Que1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter inputs in array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		Sort s1=new Sort();
		s1.setArray(arr);
		int []result=s1.getSortedArray();
		System.out.println("Sorted array is: ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		
		Max m1=new Max();
		m1.setArray(arr);
		int ans = m1.getMax();
		System.out.println("\nMax is: "+ans);
		
		Min m2=new Min();
		m2.setArray(arr);
		int xyz=m2.getMin();
		System.out.println("Min is: "+xyz);
	}
}
