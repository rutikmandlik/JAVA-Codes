import java.util.Scanner;

public class KdAlgo {
    public static long maxSubarraySum(int[] arr,int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if(sum < 0){
                sum = 0;
            }
        }
            // To consider the sum of the empty subarray
            // uncomment the following check:

            //if (maxi < 0) maxi = 0;
            
        return maxi;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int [size];
        int n = arr.length;

        System.out.println("Enter input in array: ");
        for(int i = 0;i < n;i++){
            arr[i]=sc.nextInt();
        }
    
        long maxSum = maxSubarraySum(arr , n);
        System.out.println("Maximum SubArray sum is: "+maxSum);
    }
}
