
import java.util.Scanner;

public class PlusOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int digits[] = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int result[] = plusOne(digits);

        System.out.print("Result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int result[] = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
// Time Complexity = O(n)
// Space Complexity = O(n)
