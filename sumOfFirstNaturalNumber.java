import java.util.Scanner;

public class sumOfFirstNaturalNumber {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       System.out.println("Sum : " + sum(n));
       sc.close();
    }
}
