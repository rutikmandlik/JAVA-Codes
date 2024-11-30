import java.util.*;
public class KthMissing {

    public static int missingK(int[] vec, int n, int k) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
        int[] arr = new int[size];
		System.out.println("Enter input: ");
		for(int i= 0;i<size;i++){
			arr[i] = sc.nextInt();
		}
        int n = arr.length;
		System.out.print("Enter kth number: ");
        int k = sc.nextInt();

        System.out.println("The " + k + "th missing number is: " + missingK(arr, n, k));
    }
}
