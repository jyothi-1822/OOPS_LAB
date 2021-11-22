import java.util.*;
import java.lang.*;
import java.io.*;
public class Q3
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     TreeMap<Integer, String> map=new TreeMap<Integer,String>();
	     while(n-->0)
	     {
	         String str=sc.next();
	         str=str.substring(1,str.length()-1);
	         String s[]=str.split(",");
	         String name=s[0];
	         //System.out.println(name);
	         int roll=Integer.parseInt(s[1]);
	         //System.out.println(roll);
	         int height=Integer.parseInt(s[2]);
	         //System.out.println(height);
	         if(!map.containsKey(height))
	         map.put(height,name);
	         else
	         {
	          String person1=map.get(height); 
	          if(name.compareTo(person1)<0)
	          {
	              map.put(height,name);
	          }
	         }
	         
	     }
	     System.out.println(map.size());
	     String finalans="";
	     for(Integer height:map.keySet())
	     {
	        finalans+=map.get(height)+",";
	     }
	     finalans=finalans.substring(0,finalans.length()-1);
	     System.out.println(finalans);
	     
	}
}
