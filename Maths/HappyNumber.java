import java.util.Scanner;

class HappyNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 1 && n != 4){
            int sum =0;
            while(n > 0){
                int digit = n % 10;
                int squar = digit * digit;
                sum += squar;
                n /=10;
            }
            n=sum;
        }
        if(n == 1){
            System.out.println("The Number is Happy Number.");
        }else{
            System.out.println("The Number is not Happy Number.");
        }
    }
}
//Time Complexity = O(log n)
//Space Complexity = O(1)