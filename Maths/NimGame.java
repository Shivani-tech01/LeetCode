import java.util.Scanner;

class NimGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the heap stone: ");
        int n = sc.nextInt();
        if(n <=3){
            System.out.print("You win.");
        }if (n % 4 != 0){
            System.out.print("You win.");
        }else{
        System.out.print("The opponent wins.");}
    }
}