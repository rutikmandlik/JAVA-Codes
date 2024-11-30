public class TestApp1{
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            char k = 'A'; // Initialize character A
            for (j = 1; j <= 9; j++) {
                // Print characters in the left part of the pattern
                if (j <= 6 - i) {
                    System.out.print(k);
                    k++;
                }
                // Print spaces in the middle part of the pattern
                else if (j > 6 - i && j < 4 + i) {
                    System.out.print(" ");
                }
                // Print characters in the right part of the pattern
                else if (j >= 4 + i) {
                    k--;
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
