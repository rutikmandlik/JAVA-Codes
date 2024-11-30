import java.util.*;
class ArrayOperation{
	int a[];
	void setArray(int []arr){
		this.a=arr;
		System.out.println("Main Array: ");
		System.out.println(Arrays.toString(a));
	}
	void sortAscArray(){
		for(int i=0;i<a.length;i++){
			int n = a[i];
			int count = getDigitCount(n);
			int digits []= getDigitsArray(count,n);
			int num = digitsSortedNumber(digits);
			a[i] = num;
		}
		System.out.println("\n\nArray after sorting each elements digits :");
		System.out.println(Arrays.toString(a));
	}
	void sumOfArray(){
		for(int i=0; i<a.length; i++){
			int n = a[i];

			int sum =0;
			while(n!=0){
				sum = sum + n%10;
				n/=10;
			}

			a[i] = sum;
		}
		System.out.println("\n\nArray after fiding sum of digits of each element :");
		System.out.println(Arrays.toString(a));
	}
	int getDigitCount(int n){
		int count=0;
		while(n != 0){
			n = n/10;
			count++;
		}
		return count;
	}
	int [] getDigitsArray(int size,int n){
		int a[]=new int[size];
		for(int i=0;i<size;i++){
			a[i] = n%10;
			n /= 10;
		}
		return a;
	}
	int digitsSortedNumber(int []a){
		Arrays.sort(a);
		
		int num = 0;
		for(int i=0;i<a.length;i++){
			num = num * 10 + a[i];
		}
		return num;
	}
}
public class Q1{
	public static void main(String args[]){
		int arr[]=new int[]{5732,8659,2534,9625,7354,1325};
		ArrayOperation ao=new ArrayOperation();
		ao.setArray(arr);
		ao.sortAscArray();
		ao.sumOfArray();
	}
}