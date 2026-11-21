import java.util.Scanner;

class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        while( num > 1 && num %3 ==0){
            num /=3;
        }
        if(num == 1){
            System.out.print("It is the power of 3.");
        }else{
            System.out.print("It is not the power of 3. ");
        }
    }
}
