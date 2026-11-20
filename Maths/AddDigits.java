
import java.util.Scanner;

public class AddDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        while (num>9){
            int sum =0;
            while(num>0){
                int digit = num % 10;
                sum+=digit;
                num /=10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}