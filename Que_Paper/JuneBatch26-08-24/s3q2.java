import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is a Strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
        
        sc.close();
    }

    // Function to check if a number is a Strong number
    static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);  // Add the factorial of each digit
            num /= 10;
        }

        return sum == originalNum;  // Return true if sum equals original number
    }

    // Function to calculate the factorial of a number
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
