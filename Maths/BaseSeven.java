import java.util.Scanner;

class BaseSeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.print("0");
        }
        boolean isNegative = num <0;
        long n = Math.abs((long) num);
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%7);
            n/=7;
        }
        if(isNegative){
            sb.append('-');
        }
        System.out.print(sb.reverse().toString());
    }
}