import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       int candidate = nums[0];
       int count = 0;
       for(int i=0;i<nums.length;i++){
        if(count == 0){
            candidate = nums[i];
        }
        if(nums[i] == candidate){
            count++;
        }else{
            count--;
        }
       }
       count= 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i] == candidate){
            count++;
        }
       }
       return (count > nums.length / 2) ? candidate : -1 ;
    }
}
public class MejorityInFunction{
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