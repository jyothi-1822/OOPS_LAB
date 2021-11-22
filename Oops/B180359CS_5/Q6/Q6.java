import java.util.*;
import java.lang.*;
import java.io.*;
class Membership
{
    
    int discountamt(int X)
    {
        return X;
    }
}
class Platinum extends Membership
{
    int discountamt(int X)
    {
        return ((X*20)/100);
    }
  
}
class Gold extends Membership
{
   int discountamt(int X)
    {
        return ((X*15)/100);
    } 
}
class Silver extends Membership
{
    int discountamt(int X)
    {
        return ((X*10)/100);
    }
}
class Customer
{
    String name;
    String mobileno;
    String membership;
    
    void adddetails(String a,String b,String c)
    {
        this.name=a;
        this.mobileno=b;
        this.membership=c;
    }
    void printdetails()
    {
     	System.out.println(name+"\t"+mobileno+"\t"+membership);   
    }
    String getmem()
    {
        return membership;
    }
    
}
class Service
{
    String service;
    int rate;
    void add(String a,int b,LinkedHashMap<String,Integer> map)
    {
    this.service=a;
    this.rate=b;
    map.put(service,rate);
    }
    
    void printmap(LinkedHashMap<String,Integer> map,String k)
    {
        int i=1;
    	int count=0;
    	for(String p:map.keySet())
    	{
    	    System.out.println(i+"."+p+"\t"+map.get(p));
    	    i++;
    	    count+=map.get(p);
    	}
    	
    	System.out.print("Total:"+count+"-");
    	//Customer obj3=new Customer();
        //String k=obj3.getmem();
        //System.out.println(k);
        if(k.equals("Platinum"))
        {
            Platinum obj4=new Platinum();
            int a=obj4.discountamt(count);
            System.out.print(a);
            System.out.println("\nPlease pay "+(count-a));
        }
        else if(k.equals("Gold"))
        {
            
            Gold obj5=new Gold();
            int a=obj5.discountamt(count);
            System.out.print(a);
            System.out.println("\nPlease pay "+(count-a));
            
        }
        else
        {
            
            Silver obj6=new Silver();
            int a=obj6.discountamt(count);
            System.out.print(a);
            System.out.println("\nPlease pay "+(count-a));
        }
        
    }
    
    
}
public class Q6
{
    public static void main(String[] args) 
    {
        ArrayList<Customer> list=new ArrayList<Customer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Details:");
        System.out.print("Name:");
         String name=sc.nextLine();
         System.out.print("Mobile:");
         String mobileno=sc.nextLine();
         System.out.print("Membership:");
         String membership=sc.nextLine();
        Customer obj=new Customer();
        obj.adddetails(name,mobileno,membership);
        list.add(obj);
        char ch;
        LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
        
        
        for(;;)
        {
            System.out.print("Add Service(Y/N):");
            String c=sc.nextLine();
            ch=c.charAt(0);
            if(ch=='N')
            break;
            else if(ch=='Y')
            {
                System.out.print("ServiceName:");
                String a=sc.nextLine();
                System.out.print("Rate:");
                int b=sc.nextInt();
                Service obj1=new Service();
                obj1.add(a,b,map);
            }
            else
            {
                System.out.println("Please give Y/N:");
                continue;
            }
            String esc=sc.nextLine();
            
            
        }
    	System.out.println("*****BILL*****");
        obj.printdetails();
        Service k=new Service();
        //Customer obj5=new Customer();
        
        k.printmap(map,membership);
        
    	
    	
    }
}
