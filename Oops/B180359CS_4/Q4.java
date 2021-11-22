import java.util.*;
import java.lang.*;
import java.io.*;
class Customer
{
    String customerName;
    String accountNo;
    int currentBalance;
    Customer(String customerName,String accountNo,int currentBalance)
    {
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }
    
    void availableBalance()
    {
        System.out.println(customerName+":"+currentBalance);
    }
    
}
class Silver extends Customer
{
    Silver(String customerName,String accountNo,int currentBalance)
    {
    super(customerName,accountNo,currentBalance);
    }
    int predictedbalance=0;
    void availableBalance()
    {
        predictedbalance=currentBalance+(5*currentBalance)/100;
        System.out.println(this.customerName+":"+this.currentBalance+":"+"Silver"+":"+predictedbalance);
    }
}
class Gold extends Customer
{
    Gold(String customerName,String accountNo,int currentBalance)
    {
    super(customerName,accountNo,currentBalance);
    }
    int predictedbalance=0;
    void availableBalance()
    {
      
        predictedbalance=currentBalance+(10*currentBalance)/100;
        System.out.println(this.customerName+":"+this.currentBalance+":"+"Gold"+":"+predictedbalance);
      
    }
}
class Platinum extends Customer
{
    Platinum(String customerName,String accountNo,int currentBalance)
    {
    super(customerName,accountNo,currentBalance);
    }
    int predictedbalance=0;
    void availableBalance()
    {
      
        predictedbalance=currentBalance+(15*currentBalance)/100;
        System.out.println(this.customerName+":"+this.currentBalance+":"+"Platinum"+":"+predictedbalance);
    }
}
public class Q4
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Customer> list=new ArrayList<Customer>();
		
		while(n-->0)
		{
		    String str=sc.next();
		    String s[]=str.split(":");
		    String name=s[0];
		    String accno=s[1];
		    int balance=Integer.parseInt(s[2]);
		    if(balance<100000)
		    {
		        Customer obj=new Silver(name,accno,balance);
		        list.add(obj);
		    }
		    else if(balance<1000000)
		    {
		        Customer obj=new Gold(name,accno,balance);
		        list.add(obj);
		    }
		    else
		    {
		        Customer obj=new Platinum(name,accno,balance);
		        list.add(obj);
		    }
		}
		   for(Customer obj:list)
		   {
		       obj.availableBalance();
		   }
		
		
		
		
	}
}
