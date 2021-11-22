import java.util.*;
import java.lang.*;
import java.io.*;
class Car
{
    String modelName;
    String engineNo;
    int basePrice;
    int additionalCharge;
    int totalPrice()
    {
        int x=basePrice+additionalCharge;
        return x;
    }
    
}
class Dealer
{
    String dealerName;
    float discountPercentage;
    Car obj=new Car();
    int Totalprice;
    Dealer(String modelName,String engineNo,int basePrice,int additionalCharge,String dealerName,float discountPercentage)
    {
        obj.modelName=modelName;
        obj.engineNo=engineNo;
        obj.basePrice=basePrice;
        obj.additionalCharge=additionalCharge;
        this.dealerName=dealerName;
        this.discountPercentage=discountPercentage;
        Totalprice=obj.totalPrice();
    }
   
    void OnRoadPrice()
    {
        int total=(int)(Totalprice-(float)(Totalprice*discountPercentage)/(float)100);
        System.out.println(obj.modelName+" "+Totalprice+" "+total);
    }
}


public class Q5
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Dealer> list=new ArrayList<Dealer>();
		String esc=sc.nextLine();
		  while(n-->0)
		 {
		    String str=sc.nextLine();
		    //System.out.println(str);
		    String s[]=str.split(" ");
		    String name=s[0];
		    String engno=s[1];
		    int baseprice=Integer.parseInt(s[2]);
		    int addcharge=Integer.parseInt(s[3]);
		    String dealername=s[4];
		    float discount=Float.parseFloat(s[5]);
		    Dealer obj2=new Dealer(name,engno,baseprice,addcharge,dealername,discount);
		    list.add(obj2);
		}
		   for(Dealer obj:list)
		   {
		       obj.OnRoadPrice();
		   }
		
		
		
		
	}
}
