
import java.util.Scanner;

class PowerOf2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>1 && n % 2==0){
            n= n/2;
        }
        if(n==1){
            System.out.println("The number is power of 2. ");
        }else{
            System.out.println("The number is not the power of 2. ");
        }

    }
}
// Time Complexity : O(log n )
//Space complexity : O(1)