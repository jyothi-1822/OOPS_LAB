import java.io.*;
import java.util.*;
import java.lang.*;

public class Q2{
   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      
       HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
       HashMap<Integer,String> map2=new HashMap<Integer,String>();
       System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
       for(;;)
       {
           String str=sc.nextLine();
           if(str.equals("OKAY"))
           break;
           String divide[]=str.split(" ");
           int id=Integer.parseInt(divide[0]);
           String name=divide[1];
           int price=Integer.parseInt(divide[2]);
           map1.put(id,price);
           map2.put(id,name);
       }
	   System.out.println();
       for(;;)
       {
           System.out.println("1.Add Invoice\n2.Exit\nChoice:");
           int m=sc.nextInt();
           
           int flag=0;
           switch(m)
           {
               case 1:
			       System.out.println();
                   System.out.println("Add Invoice Item(Y/N)");
                   String esc=sc.nextLine();
                   char p=sc.nextLine().charAt(0);
                   if(p=='Y')
                   {
                       System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
                       for(;;)
                       {
                       String s=sc.nextLine();
                       if(s.equals("OKAY"))break;
                       String d[]=s.split(" ");
                       int id=Integer.parseInt(d[0]);
                       int quantity=Integer.parseInt(d[1]);
                       map.put(id,quantity);
                       }
                       int totalcost=0;
                       System.out.println("****INVOICE****");
                       for(Integer id :map.keySet())
                       {
                          int cost=map1.get(id);
                          System.out.println(id+","+map2.get(id)+","+map1.get(id)+","+map.get(id));
                         
                          totalcost+=map.get(id)*cost;
                          
                       }
                       System.out.println("Total: "+totalcost);
                       System.out.println("********");
					   System.out.println();
                   }
                   
                   break;
               case 2:
                   flag=1;
                   break;
               
           }
           if(flag==1)
           break;
       }
       
   }
   
}
