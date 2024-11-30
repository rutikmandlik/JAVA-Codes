import java.util.Scanner;

public class MajorityArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the candidate for majority element
        int candidate = findMajorityElement(arr, 0, n, 0);

        // Check if the candidate is really the majority element
        if (isMajority(arr, candidate, 0, 0)) {
            System.out.println("The array is a majority array with the majority element: " + candidate);
        } else {
            System.out.println("The array does not have a majority element.");
        }

        sc.close();
    }

    // Function to find the majority element candidate using recursion
    static int findMajorityElement(int[] arr, int index, int n, int count) {
        if (index == n) {
            return count;
        }

        // Simple approach to track a candidate (Moore's voting algorithm style)
        if (count == 0) {
            count = arr[index]; // New candidate when count is 0
        } else if (arr[index] == count) {
            count++; // Increment count for the same element
        } else {
            count--; // Decrement count for different element
        }

        return findMajorityElement(arr, index + 1, n, count);
    }

    // Function to check if the candidate is really the majority element using recursion
    static boolean isMajority(int[] arr, int candidate, int index, int frequency) {
        if (index == arr.length) {
            return frequency > arr.length / 2; // Check if candidate appears more than half
        }

        if (arr[index] == candidate) {
            frequency++;
        }

        return isMajority(arr, candidate, index + 1, frequency);
    }
}
