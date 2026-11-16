
import java.util.Scanner;

public class ClimbingStairs{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        int full=2;
        if(n<=2){
            System.out.println(n);
        }else{
        for(int i =3;i<=n;i++){
            int temp = count+full;
            count=full;
            full=temp;
        }
    System.out.println(full);}
        sc.close();
    }
}
//Time Complexity = O(n)
//Space Complexity = O(1)