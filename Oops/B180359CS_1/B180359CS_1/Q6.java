import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        String num = Integer.toString(a);
        int i = 0;
        int j = num.length() - 1;
        int flag = 0;
        while (i < j) {
            if (num.charAt(i) != num.charAt(j)) {
                System.out.println("False");
                flag = 1;
                break;
            } else {
                i++;
                j--;
            }
        }
        if (flag == 0) {
            System.out.println("True");
        }
    }
}
