import java.util.*;
class ArrayOperation{
	int a[];
	ArrayOperation(int arr[]){
		this.a=arr;
	}
	void calSum(){
		for(int i=0;i<a.length;i++){
			int n = a[i];
			int count = getDigitCount(n);
			int digits []= getDigitsArray(count,n);
			int num = digitsNumber(digits);
			a[i] = num;
		}
	}
	int []sumOfArray(){
		for(int i=0; i<a.length; i++){
			int n = a[i];

			int sum =0;
			while(n!=0){
				sum = sum + n%10;
				n/=10;
			}

			a[i] = sum;
		}
		return a;
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
	int digitsNumber(int []a){
		int num = 0;
		for(int i=0;i<a.length;i++){
			num = num * 10 + a[i];
		}
		return num;
	}
}
public class Que3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter input in array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		ArrayOperation ao=new ArrayOperation(arr);
		ao.calSum();
		int result[]=ao.sumOfArray();
		System.out.println("Resultant array is: ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}