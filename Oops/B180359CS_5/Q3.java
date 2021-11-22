import java.util.*;
import java.lang.*;
import java.io.*;
class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void area()
    {
        System.out.println("Rectangle Area "+length*breadth);
    }
    void Perimeter()
    {
        System.out.println("Rectangle Perimeter "+2*(length+breadth));
    }
}

class Square extends Rectangle
{
    Square(int length)
    {
        super(length,length);
    }
    void area()
    {
        System.out.println("Square Area "+length*length);
    }
    void Perimeter()
    {
        System.out.println("Square Perimeter "+(length)*4);
    }
    
}

public class Q3
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String str[]=s.split(" ");
	if(str.length==1)
	{
	Square obj=new Square(Integer.parseInt(str[0]));
        
	    obj.Perimeter();
	    obj.area();
	}
	
	else if(str.length==2)
	{
	    Rectangle obj1=new Rectangle(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
	    
	    obj1.Perimeter();
	    obj1.area();
	}
	
	else{
	    System.out.println("Please give avalid input");
	}
}
}
