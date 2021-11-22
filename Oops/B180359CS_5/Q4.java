import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Addition
{
    abstract void add();
    
}
class IntegerAddition extends Addition
{
    int a;
    int b;
    IntegerAddition(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        System.out.println(a+b);
    }
}
class FractionAddition extends Addition
{
    int a,b,c,d;
    FractionAddition(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    static int gcd(int a, int b)
    {
    if (a == 0)
        return b;
    return gcd(b%a, a);
    }
    static void lowest(int d, int n)
    {
   
    int cf = gcd(n,d);
    d = d/cf;
    n = n/cf;
    System.out.println(n+"/"+d);
    }

    void add()
    {
       int den3 = gcd(b,d);
       den3 = (b*d) / den3;
       int num3 = (a)*(den3/b) + (c)*(den3/d);
       lowest(den3,num3);
    }
    
}

public class Q4
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String str[]=s.split(" ");
	IntegerAddition obj=new IntegerAddition(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
	String s1=sc.nextLine();
	String str1[]=s1.split(" ");
    FractionAddition obj1=new FractionAddition(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),Integer.parseInt(str1[2]),Integer.parseInt(str1[3]));
	obj.add();
	
    obj1.add();
    }
}
