import java.util.*;
import java.lang.*;
import java.io.*;
class displayaction
{
    void display(int n)
    {
       int sum=0;
       System.out.print("Sample Output\t"+"Explaination\n");
       System.out.print((n*(n+1))/2);
       System.out.print("\t"+"\t");
       for(int i=1;i<n;i++)
       {
           sum+=i;
           System.out.print(i+"+");
       }
       sum+=n;
       System.out.print(n+"="+sum);
    }
    
    void display(int a,int b)
    {
       System.out.print("Sample Output\t"+"Explaination\n");
       System.out.print(a*a+b*b);
       System.out.print("\t"+"\t");
       System.out.println(a+"*"+a+"+"+b+"*"+b+"="+a*a+"+"+b*b+"="+(a*a+b*b));
        
    }
    void display(char c,int N)
    {
        System.out.print("Sample Output\t"+"Explaination\n");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
public class Q1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sample Input");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		//System.out.println(str.length);
		displayaction obj=new displayaction();
		if(str.length==1)
		{
		obj.display(Integer.parseInt(str[0]));
		}
		else if(str.length==2)
		{
		    int flag=0;
		    try 
		    {
		        int p=Integer.parseInt(str[0]);
		        
		        
		    } 
		    catch(Exception e) 
		    {
		       flag=1; 
		    } 
		    if(flag==0)
		    {
		       obj.display(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		    }
		    else if(flag==1)
		    {
		       obj.display(str[0].charAt(0),Integer.parseInt(str[1]));
		    }
		}
		else
		{
		    System.out.println("Please give valid input");
		}
	}
}
