import java.util.*;
import java.lang.*;
import java.io.*;

public class Q1
{
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	try
	{
	    char op = sc.next().charAt(0);
	    String esc=sc.nextLine();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int result=0;
	    switch(op)
	    {
	        case '+':
	            result=a+b;
	            System.out.println(result);
	            break;
	        case '-':
	            result=a-b;
	            System.out.println(result);
	            break;
	        case '*':
	            result=a*b;
	            System.out.println(result);
	            break;
	        case '/':
	            result=a/b;
	            System.out.println(result);
	            break;
	       default:
	            
	             throw new Exception("Illegal Operator " + op+" ,Enter a valid operator.");
	        
	    }
	}
	
	catch(ArithmeticException ae)
	{
	    System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument");
	}
	catch (InputMismatchException ex) 
	{
    System.out.println("InputMismatchException: Invalid input! You have to enter a integer");
	}
	finally
	{
	    sc.close();
	}
	}
}
