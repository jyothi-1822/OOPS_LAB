import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Student
{
    abstract int getFeedetails();
    abstract void setFeedetails(int fee);
    
}
class Undergraduate extends Student
{
    int fee=0;
    String name;
    String roll;
    String section;
    Undergraduate(String name,String roll,String section)
    {
        this.name=name;
        this.roll=roll;
        this.section=section;
    }
    void setFeedetails(int fee)
    {
        this.fee=fee;
    }
    int getFeedetails()
    {
        return fee;
    }
     String getroll()
    {
        return this.roll;
    }
}
class postgraduate extends Student
{
    int fee;
    String name;
    String roll;
    String section;
    postgraduate(String name,String roll,String section)
    {
        this.name=name;
        this.roll=roll;
        this.section=section;
    }
     void setFeedetails(int fee)
    {
        this.fee=fee;
    }
    int getFeedetails()
    {
        return fee;
    }
    String getroll()
    {
        return this.roll;
    }
}

public class Q5
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String str1[]=s1.split(" ");
	

	int n=sc.nextInt();
	ArrayList<Undergraduate> list=new ArrayList<Undergraduate>();
	ArrayList<postgraduate> list1=new ArrayList<postgraduate>();
	String esc=sc.nextLine();
	while(n-->0)
		 {
		    String str=sc.nextLine();
		    //System.out.println(str);
		    String s[]=str.split(" ");
		    String name=s[0];
		    String roll=s[1];
		    String section=s[2];
            if(section.equals("UG"))
            {
            Undergraduate obj1=new Undergraduate(name,roll,section);
            obj1.setFeedetails(Integer.parseInt(str1[0]));
            list.add(obj1);
            }
            else
            {
            postgraduate obj2=new postgraduate(name,roll,section);
            obj2.setFeedetails(Integer.parseInt(str1[1]));
		    list1.add(obj2);
            }
		}
		String find=sc.nextLine();
		int flag=0;
		for(Undergraduate obj:list)
		{
		    if((obj.getroll()).equals(find))
		    {
		        System.out.println(obj.getFeedetails());
		        flag=1;
		        break;
		    }
		}
		if(flag==0)
		{
    	   for(postgraduate obj:list1)
    		{
    		    if((obj.getroll()).equals(find))
    		    {
    		        System.out.println(obj.getFeedetails());
    		        break;
    		    }
    		}
		}	
	
	
    }
}
