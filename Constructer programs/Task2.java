/*
Q2. WAP to Given integer array move all 0’s at the end while maintaining the relative order the non zero elements.
Note: perform operation on same do not use duplicate or another array.
Example:
Input: nums=[0,1,0,3,12];
Output: 1 ,3,12,0 0

Your Task
You have to create class name as ShiftZero with parameterized constructor

ShiftZero(int a[]): this constructor can accept number as parameter 
int [] getArrayAfterShifting(): you have to perform operation on same and return it array after shifting zero.
*/

class ShiftZero
{
	int []a;
	ShiftZero(int []a){
		this.a=a;
	}
	int[] getArrayAfterShifting() {
        int pos = 0; // Pointer for placing non-zero elements

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[pos] = a[i];
                pos++;
            }
        }

        // Fill the remaining positions with zeros
        while (pos < a.length) {
            a[pos] = 0;
            pos++;
        }

        return a;
    }
}
public class Task2
{
	public static void main(String args[])
	{
		int arr[]=new int[]{0,1,0,3,12};
		
		ShiftZero sz=new ShiftZero(arr);
		
		int result[]=sz.getArrayAfterShifting();
		
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}