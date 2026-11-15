
import java.util.Scanner;

public class ReverseInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        long reverse=0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            System.out.println(0);
        }
        System.out.println((int) reverse);
    }
}