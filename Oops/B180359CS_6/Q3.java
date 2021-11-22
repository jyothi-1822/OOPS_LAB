import java.util.*;
import java.lang.*;
import java.io.*;
interface ShapeArea
{
    double area(int x);
}

class Circle implements ShapeArea
{  
    
    public double area(int x)
    {
       double pi=3.14;
        return Math.round(pi*x*x*100.0)/100.0;   //assumed that the area is rounded off to two decimal points
    }
}
class Square implements ShapeArea
{
    public double area(int x)
    {
        return x*x;
    }
}
public class Q3
{
	public static void main(String[] args)throws Exception {
	 Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
	 int n=sc.nextInt();
	 Class c=Class.forName(name);
	 ShapeArea ref=(ShapeArea)c.newInstance();
	 if(ref.area(n)%(int)ref.area(n)==0)
	 System.out.println((int)ref.area(n));
	 else
	 System.out.println(ref.area(n));
	 
	}
}
