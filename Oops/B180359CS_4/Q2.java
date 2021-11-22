import java.util.*;
import java.lang.*;
import java.io.*;
class Allshapearea
{
    void area(int a)
    {
        double pi=3.14159;
        double area=(pi*a*a);
        System.out.print("Circle:");
        System.out.printf("%.2f",area);
    }
        
    
    void area(int a,int b)
    {
        float area=a*b;
        System.out.print("Rectagle:");
        System.out.printf("%.2f",area);
    }
    void area(int a,int b,int c)
    {
        float p = (a+b+c)/2; 
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        area=area*100;
        area=Math.floor(area)/100;
        System.out.print("Triangle:");
        System.out.printf("%.2f",area);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String count[]=s.split(" ");
		Allshapearea obj=new Allshapearea();
		if(count.length==1)
		obj.area(Integer.parseInt(count[0]));
		if(count.length==2)
		obj.area(Integer.parseInt(count[0]),Integer.parseInt(count[1]));
		else if(count.length==3)
		obj.area(Integer.parseInt(count[0]),Integer.parseInt(count[1]),Integer.parseInt(count[2]));
		
		
	}
}
