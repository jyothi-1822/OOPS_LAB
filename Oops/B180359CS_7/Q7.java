import java.util.*;
import java.lang.*;
import java.io.*;

public class Q7
{
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	try {
	    
	    String s=sc.nextLine();
	    System.out.println(Integer.parseInt(s,16));
	} 
	catch (NumberFormatException nfe) 
	{
	    System.out.println("InvalidHexadecimal Exception");
	}
	finally
	{
	    sc.close();
	}
}
}