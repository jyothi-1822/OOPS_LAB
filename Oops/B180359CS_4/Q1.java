import java.util.*;
import java.lang.*;
import java.io.*;
class Bitwise
{
    void bitwise(int a,int b)
    {
        System.out.println(a+b);
    }
    void bitwise(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class Q1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String count[]=s.split(" ");
		Bitwise obj=new Bitwise();
		if(count.length==2)
		obj.bitwise(Integer.parseInt(count[0]),Integer.parseInt(count[1]));
		else if(count.length==3)
		obj.bitwise(Integer.parseInt(count[0]),Integer.parseInt(count[1]),Integer.parseInt(count[2]));
		else
		System.out.println("Please enter the correct input");
		
	}
}
