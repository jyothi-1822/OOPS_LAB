import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	try {
	    
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i=0;
	    while(i<n)
	    {
	        arr[i]=sc.nextInt();
	        i++;
	    }
	    String escape=sc.nextLine();
	    String s=sc.nextLine();
	    //System.out.println(s);
	    String str[]=s.split(" ");
	    //System.out.println(str[0]);
	    int sum=0;
	    i=0;
	    while(i<str.length)
	    {
	      sum+=arr[Integer.parseInt(str[i++])];
	    }
	    System.out.println("Output:"+sum);
	    
	} 
	catch (ArrayIndexOutOfBoundsException ae) 
	{
	    System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
	}
	finally
	{
	    sc.close();
	}
}
}