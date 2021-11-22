import java.util.Scanner;

public class Q2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("a=");
            int s1=sc.nextInt();
            System.out.print("b=");
            int s2=sc.nextInt();
            s1=s1^s2;
            s2=s1^s2;
            s1=s1^s2;
            System.out.println("a="+s1);
            System.out.println("b="+s2);


        }
    }


