import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        int original = num ;
        while(num > 0){
            int digit = num % 10;
            if(original % digit == 0){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
// Time complexity : O(d)
// Space complexity : O(1)