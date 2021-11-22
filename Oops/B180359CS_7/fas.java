import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface BillGenerator
{
    void generatebill();
    void DisplayBill();
}
class ElectricityBill implements BillGenerator
{
    int consumerNumber;
    String customerName;
    int prevmonthReading;
    int curremonthReading;
    String typeofconn;

    void generatebill()
    {
        int totalunits=curremonthReading-prevmonthReading;
        int storeunits=totalunits;
        double totalbill=0;
        if(typeOfConnection.equals("Domestic"))
        {
            if (totalunits<=50)
            {
                totalbill=totalunits*3;
            }
            else if (totalunits<=100)
            {
                totalbill= (50*3) +(totalunits - 50) *3.15;
            }
            else if (totalunits <= 150)
            {
                totalbill=(50 *3) +(50 * 3.15) +(totalunits -100) *3.80;
            }
            else if (totalunits>150)
            {
                totalbill=(50 *3) +(50 * 3.15) +(50*3.80)+(totalunits-150)*4.00;   
            }
            
            System.out.println(totalbill);
        }
        else if(typeOfConnection.equals("Commercial"))
        {
            if (totalunits<=300)
            {
                totalbill=totalunits*5.5;
            }
            else if (totalunits<=400)
            {
                totalbill= (300*5.5) +(totalunits - 300) *6.60;
            }
            else if (totalunits <= 500)
            {
                totalbill=(300*5.5) +(100*6.6) +(totalunits -400) *7.70;
            }
            else if (totalunits>500)
            {
                totalbill=(300*5.5) +(100*6.6) +(100*7.70)+(totalunits-500)*8.00;   
            }
            System.out.println(totalbill);
            
        }
    }
    void Displaybill()
    {
      System.out.println(consumerNumber);
      System.out.println(consumerName);
      System.out.println(storeunits);
      double finalbill = Math.round(totalbill* 100.0) / 100.0;
      //System.out.printf("%.1f/n",finalbill); 
      System.out.printf("%.2f\n",finalbill); 
    }
    ElectricityBill(int a, String b, int c, int d, String e)
    {
        this.consumerNumber=a;
        this.consumerName=b;
        this.prevmonthReading=c;
        this.curremonthReading=d;
        this.typeofconn=e;
    }
}
class PhoneBill implements BillGenerator
{
    int customerId;
    String customerName;
    int totalMinutes;
    double fixedrate=250;
    int totalbill=0;
    int callrate=0;
    public void generateBill()
    {
        
        if(totalMinutes<=100)
        {
            totalbill+=0;
            callrate=totalMinutes;
        }
        else if(totalMinutes>100)
        {
            totalbill+=(totalMinutes-100)*1.5;
            callrate=totalMinutes-100;
        }
    }
    
    public void displayBill()
    {
        System.out.println(customerId);
        System.out.println(customerName);
        System.out.println(callrate);
        double finalbill = Math.round(finalbill* 100.0) / 100.0;
        System.out.printf("%.2f\n",roundOff);
        
    }
    PhoneBill(int a, String b, int c)
    {
        this.customerId=customerId;
        this.customerName=customerName;
        this.totalMinutes=totalMinutes;
    }
}


public class Main
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       if(s.charAt(0).equals('E'))
       {
           if(s.charAt(2).equals('C'))
           {
            String type="Commercial";
            try 
            {
                int cusId=sc.nextInt();
            }
            catch(Exception e)
            {
               System.out.println(NotANumberException);
               return;
            }
            String esc=sc.nextLine();
            try
            {
             String cusname=sc.nextLine();
           }
           catch(Exception e)
            {
               System.out.println(NotAStringException);
               return;
           }
           
           try 
           {
            int prevmonth=sc.nextInt();
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
           
           try 
           {
            int currmonth=sc.nextInt();
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
           ElectricityBill obj=new ElectricityBill(int cusId, String cusname, int prevmonth, int currmonth, String type);
           obj.generateBill();
           obj.Displaybill();
           
           
               
          }
          
          
          
          
          else if(s.charAt(2).equals('D')
           {
               
            String type="Domestic";
            
            try 
            {
                int cusId=sc.nextInt();
            }
            catch(Exception e)
            {
               System.out.println(NotANumberException);
               return;
            }
             String esc=sc.nextLine();
            try
           {
            
              
               String cusname=sc.nextLine();
           }
           catch(Exception e)
            {
               System.out.println(NotAStringException);
               return;
           }
           
           try 
           {
            int prevmonth=sc.nextInt();
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
           
           try 
           {
            int currmonth=sc.nextInt();
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
           ElectricityBill obj=new ElectricityBill(int cusId, String cusname, int prevmonth, int currmonth, String type);
           obj.generateBill();
           obj.Displaybill();
           
           }
       }
       else if(s.charAt(0).equals('P'))
       {
           try 
           {
            int cusId=sc.nextInt();
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
           
           String esc=sc.nextLine();
           try
           {
            
               
               String cusname=sc.nextLine();
           }
           catch(Exception e)
            {
               System.out.println(NotAStringException);
               return;
           }
           
           
           try
           {
            int totalmin=Integer.parseInt(sc.nextLine());
           }
           catch(Exception e)
           {
               System.out.println(NotANumberException);
               return;
           }
          
           PhoneBill obj1=new PhoneBill(int cusId,String cusname,int totalmin);
           obj1.generateBill();
           obj1.Displaybill();
       }
    }
}

