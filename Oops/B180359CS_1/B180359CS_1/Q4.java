import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println(rev);
    }
}
