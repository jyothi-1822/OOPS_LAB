import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int c = 0;
        while (a > 0) {
            a = a / 10;
            c++;
        }
        System.out.println(c);
    }
}
