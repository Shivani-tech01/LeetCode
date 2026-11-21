import java.util.Scanner;

class PalindromeNumber {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int original = x;
    int reverse =0;
    while( x>0 ){
        int digit = x % 10;
        reverse = reverse * 10 + digit;
        x = x / 10;
    }
    if(original == reverse){
        System.out.println("The number is Palindrome Number.");
    }else{
        System.out.println("The number is not a Palindrome Number.");
    }
}
}
// Time Complexity = O(log n);
// Space Complexity = O(1);

