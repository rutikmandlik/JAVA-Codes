import java.util.*;
class Solution {
    public int helperFunction(int[] arr, int start, int elem) {
        int count = 0;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return helperFunction(arr, i, arr[i]);
            }
        }
        return elem;
    }
    public int majorityElement(int[] nums) {
      return helperFunction(nums, 0, nums[0]);
    }
}
public class MejorityUsingRecursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter input: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		Solution s1=new Solution();
		int result = s1.majorityElement(arr);
		System.out.println("Mejority element is: "+result);
	}
}