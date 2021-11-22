import java.util.*;
import java.lang.*;
import java.io.*;
interface MyInter
{
    int convertRupees(int x);
    int convertDollars(int x);
    int convertPounds(int x);
}
class Bank implements MyInter
{
    public int convertRupees(int x)
    {
        return x;
    }
    public int convertDollars(int x)
    {
        return 70*x;
    }
    public int convertPounds(int x)
    {
        return 100*x;
    }
}
public class Q1
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int total=sc.nextInt();
	 int Aprice=sc.nextInt();
	 MyInter obj=new Bank();
	 
	 int Bprice=sc.nextInt();
	 int Cprice=sc.nextInt();
	 if((obj.convertRupees(Aprice)+obj.convertDollars(Bprice)+obj.convertPounds(Cprice))>total)
	 {
	     System.out.println("Insufficient balance");
	     System.exit(0);
	 }
	 int result=total-(obj.convertRupees(Aprice))-(obj.convertDollars(Bprice))-(obj.convertPounds(Cprice));
	 System.out.println(result);
	}
}
