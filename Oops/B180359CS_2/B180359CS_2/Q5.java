import java.util.Scanner;

public class Q5 {
    public static int calculate_bill(String x,int y)
    {
        int total_bill=0;
        String[] parts = x.split(" ");
        String part2 = parts[1];
        String part3=  parts[2];
        if(part3.equals("veg"))
        {
            total_bill=y*100;
        }
        if(part3.equals("nonveg"))
        {
            total_bill=y*120;
        }
        if(part2.equals("employee"))
        {
            total_bill=total_bill+(int)(5*(total_bill)/100);
        }
        return total_bill;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the intimate details:");
        String x=sc.nextLine();
        System.out.print("Enter the number of days:");
        int y=sc.nextInt();
        System.out.println(calculate_bill(x,y));


    }
}
