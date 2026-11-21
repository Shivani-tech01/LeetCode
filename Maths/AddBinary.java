
import java.math.BigInteger;
import java.util.Scanner;
class AddBinary {

    public static String addBinary(String a, String b) {

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        return num1.add(num2).toString(2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String b = sc.nextLine();

        String result = addBinary(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}
//Time Complexity: O(n + m)
//Space Complexity: O(n + m)
