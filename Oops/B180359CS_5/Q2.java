import java.util.*;
import java.lang.*;
import java.io.*;
class Bank
{
  int X;
  Bank(int X)
  {
      this.X=X;
  }
  void getamount()
  {
     System.out.println(X); 
  }
}
class SBI extends Bank
{
    SBI(int X)
    {
    super(X);
    }
    void getamount()
    {
      float ans=(X*5*1)/100;
      if(ans%(int)ans==0)
          {
          System.out.printf("SBI interest is :%.0f",ans);
          //System.out.printf("%.0f",ans);
          System.out.println();
          }
      else
       System.out.println("SBI interest is"+ans);
    }
}
class ICICI extends Bank
{
    ICICI(int X)
    {
    super(X);
    }
    void getamount()
    {
    float ans=(X*6*1)/100;
    if(ans%(int)ans==0)
          {
          System.out.printf("ICICI interest is :%.0f",ans);
          //System.out.printf("%.0f",ans);
          System.out.println();
          }
      else
       System.out.println("ICICI interest is"+ans);
    }
}
class AXIS extends Bank
{
    AXIS(int X)
    {
    super(X);
    }
    void getamount()
    {
        float ans=(X*7*1)/100;
        if(ans%(int)ans==0)
          {
          System.out.printf("AXIS interest is :%.0f",ans);
          //System.out.printf("%.0f",ans);
          System.out.println();
          }
      else
       System.out.println("AXIS interest is"+ans);
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("X=");
    	int n=sc.nextInt();
    	SBI obj1=new SBI(n);
    	obj1.getamount();
    	ICICI obj2=new ICICI(n);
    	obj2.getamount();
    	AXIS obj3=new AXIS(n);
    	obj3.getamount();
	
    }
}
