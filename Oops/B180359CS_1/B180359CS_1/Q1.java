import java.io.*;
import java.lang.*;
import java.util.*;
public class Q1
    {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the base of the number: ");
            long a=sc.nextInt(); // Number
            System.out.print("Enter the exponent: ");
            long n=sc.nextInt(); // Power
            System.out.println(a+" Power "+n+" is:");
            long ans=1; // to store result
            while(n!=0)
            {
                if(n%2==0)
                {
                    a=(a*a);
                    n=n/2;
                }
                else{
                        ans=(ans*a);
                        n--;

                    }
                }
                System.out.println(ans);

            }
        }
