import java.util.*;
import java.lang.*;
import java.io.*;
interface HDFC
{
    void transaction(int balance,int cost,LinkedHashMap<Integer,Integer>map);
}
interface ICICI
{
    void transaction(int balance,int cost,LinkedHashMap<Integer,Integer>map);
}
class Flipkart implements HDFC,ICICI
{
    int flipbalance=0;
    public void transaction(int balance,int cost,LinkedHashMap<Integer,Integer>map)
    {
        flipbalance+=cost;
        balance=balance-cost;
        map.put(flipbalance,balance);
    }
    
}
public class Q2
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String esc=sc.nextLine();
	  Flipkart obj=new Flipkart();
	  LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
	 while(n>0)
	 {
	     String s=sc.nextLine();
	     String details[]=s.split(" ");
	     String name=details[0];
	     int balance=Integer.parseInt(details[1]);
	     int price=Integer.parseInt(details[2]);
	     obj.transaction(balance,price,map);
	     n--;
	 }
	  for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
  
            Integer key = mapElement.getKey();
            Integer value = mapElement.getValue();
            System.out.println(key + "  " + value);
        }
	 return;
	
	}
}
