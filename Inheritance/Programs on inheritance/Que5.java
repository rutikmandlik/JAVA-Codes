import java.util.*;
interface ArrayOperation{
	void performOperation(int x[]);
}
class Sorting implements ArrayOperation{
	public void performOperation(int x[]){
		Arrays.sort(x);
		
		System.out.println("\nArray after Sorting: ");
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
}
class Insertion implements ArrayOperation{
	int no,ind;
	void setValue(int value, int index){
		no = value;
		ind = index;
	}
	public void performOperation(int x[]){
		x[ind] = no;
		System.out.println("\nArray after Insertion: ");
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
}
class Deletion implements ArrayOperation {
    private int index;

    void setIndex(int index) {
        this.index = index;
    }

 
    public void performOperation(int[] x) {
        if (index < 0 || index >= x.length) {
            System.out.println("Invalid index for deletion.");
            return;
        }

        // Shift elements to the left to overwrite the target element
        for (int i = index; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }
		x[x.length - 1] = 0;
        System.out.println("\nArray after deletion:");
        for (int i = 0; i < x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
    }
}

class Rev implements ArrayOperation{
	public void performOperation(int x[]){
		int left = 0;
		int right = x.length - 1;
		while(left < right){
			int temp = x[left];
			x[left] = x[right];
			x[right] = temp;
			left++;
			right--;
		}
		System.out.println("\nArray after Reverse: ");
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
}
public class Que5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int []a=new int[6];
		System.out.println("Enter 6 inputs in an array: ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		Sorting s1 = new Sorting();
		Insertion i1 = new Insertion();
		Deletion d1 = new Deletion();
		Rev r1 = new Rev();
		
		while(true){
			System.out.println("\n\nPerform Below Operation: ");
			System.out.println("=============================");
			System.out.println("1.Sorting");
			System.out.println("2.Insertion");
			System.out.println("3.Deletion");
			System.out.println("4.Reverse Array");
			System.out.println("5.Exit");
			System.out.println("=============================");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1: 
						
						s1.performOperation(a);
						break;
						
				case 2: 
						System.out.print("Enter Index in which you want to insert value: ");
						int index = sc.nextInt();
						System.out.print("Enter Value you want to insert: ");
						int value = sc.nextInt();
						
						i1.setValue(value,index);
						i1.performOperation(a);
						break;
						
				case 3:
						System.out.print("Enter index want to delete: ");
						int ind = sc.nextInt();
						
						d1.setIndex(ind);
						d1.performOperation(a);
						break;
						
				case 4: 
						
						r1.performOperation(a);
						break;
				case 5:
						System.out.println("Exiting...");
						return;
				default:
						System.out.println("Wrong Choice!Try again.");
				
			}
		}
	}
}