
import java.util.Scanner;

class ReverseInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        long reverse=0;
        while(x != 0){
            int digit = x % 10; // last digit 
            reverse = reverse * 10 + digit; // reverse 
            x = x / 10; //remove last digit 
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            System.out.println(0);
        }
        System.out.println((int) reverse);
    }
}
// Time Complexity = O(d) where d is the number of the digits
// Space Complexity = O(1)