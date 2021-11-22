import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n;
    	    try 
    	    {
    	        int n=sc.nextInt();
    	    }
    	    catch(NumberFormatException nfe)
    	    {
    	        System.out.println("FormatError");
    	    }
	        int arr[]=new int[n+1];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        String str=sc.nextLine();
			String str1[]=str.split(" ");
			int a=Integer.parseInt(str1[1])-1;
			int b=Integer.parseInt(str1[3])-1;
	        int res=b-a;
	        int arr1[]=new int[res];
	        int k=0;
	        for(int j=a;j<=b;j++)
	        {
	            System.out.print(arr[j]+" ");
	            arr1[k++]=arr[j];
	        }
	        int x=0;
	        int y=0;
	        int max=Integer.MIN_VALUE;
			for(int i=a;i<b;i++)
			{
		    for(int j=i+1;j<=b;j++)
		    {
		        if(Math.abs(arr[j]-arr[i])>max)
    		    {
    		        
    		        max=Math.abs(arr[j]-arr[i]);
    		        x=arr[i];
    		        y=arr[j];
    		    }
		    }
		    
	     	}
		System.out.println(x+" "+y);
	        int sum=0;
	        for(int p=0;p<k;p++)
	        {
	            sum+=arr1[p];
	        }
	        System.out.println(sum);
	        
	    } 
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("ArrayIndexError");
	        
	    } 
	    catch(NumberFormatException nfe)
	    {
	        System.out.println("FormatError");
	    }
	    finally {
	    }
        
	
}
