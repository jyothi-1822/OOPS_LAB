import java.util.*;
import java.lang.*;
import java.io.*;
interface TaxCalculatable
{
   int calculateTax();
}
class Vehicle implements TaxCalculatable
{
    String modelNumber;
    int rateBought;
    String fuelType ;
    int numberOfWheels;
    vehicle(String modelNumber,int rateBought,String fuelType,int numberOfWheels)
    {
        this.modelNumber=modelNumber;
        this.rateBought=rateBought;
        this.fuelType=fuelType;
        this.numberOfWheels=numberOfWheels;
    }
    
    void calculateTax()
    {
      System.out.println(" ");  
    }
    
}
class Car extends Vehicle
{
    int numberOfPassengers;
    int taxamount;
    Car(String modelNumber,int rateBought,String fuelType,int numberOfWheels,int numberOfPassengers)
    {
        super(modelNumber,rateBought,fuelType,numberOfWheels);
        this.numberOfPassengers=numberOfPassengers;
    }
    int calculateTax(String fuelType)
    {
        if(fuelType.equals("petrol")
        {
            taxamount=(rateBought*0.1 * numberOfPassengers)*0.5;
        }
        else
        {
             taxamount=(rateBought*0.1 * numberOfPassengers)*0.4;
        }
        return taxamount;
    }
    
    public static void sort(ArrayList<Car> list1)
    {
  
        list1.sort((o1, o2)-> o1.calculateTax().compareTo(o2.calculateTax()));
    }
  
    
    
}
class Truck extends Vehicle
{
    int loadLimit;
    Truck(String modelNumber,int rateBought,String fuelType,int numberOfWheels,int loadlimit)
    {
        super(modelNumber,rateBought,fuelType,numberOfWheels);
        this.loadLimit=loadlimit;
    }
    int calculateTax(String fuelType)
    {
        if(fuelType.equals("petrol")
        {
            taxamount=(rateBought*0.1 * loadLimit*0.002)*0.5;
        }
        else
        {
             taxamount=(rateBought*0.1 * loadLimit*0.002)*0.4;
        }
        return taxamount;
    }
    public static void sort(ArrayList<Truck> list2)
    {
  
        list2.sort((o1, o2)-> o1.calculateTax().compareTo(o2.calculateTax()));
    }
  
    
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Car> list1=new ArrayList<Car>();
	    ArrayList<Truck> list2=new ArrayList<Truck>();
	 while(true)
	 {
	     System.out.println("1. Add Vehicle\n2. Display Vehicles\n3. Exit\nEnter your choice:\n");
         int n=sc.nextInt();
         String esc=sc.nextLine();
         switch(n)
         {
             case 1:
                 System.out.println("a.Car\nb.Truck\n");
                 System.out.println("Enter your choice:");
                 char ch=sc.nextLine().charAt(0);
                 if(ch=='a')
                 {
                 System.out.println("ModelNumber:");
                 String model=sc.nextLine();
                 System.out.println("Rate:");
                 int rate=sc.nextInt();
                 System.out.println("FuelType(petrol/diesel):");
                 String fueltype=sc.nextLine();
                 System.out.println("Passengers:");
                 int passengers=sc.nextInt();
                 car obj=new Car(model,rate,fueltype,4,passangers);
                 
                 list1.add(obj);
                 obj.sort(list1);
                 }
                 if(ch=='b')
                 {
                 System.out.println("ModelNumber:");
                 model=sc.nextLine();
                 System.out.println("Rate:");
                 rate=sc.nextInt();
                 System.out.println("FuelType(petrol/diesel):");
                 fueltype=sc.nextLine();
                 System.out.println("loadlimit");
                 int loadlimit=sc.nextInt(); 
                 Truck obj1=new Truck(model,rate,fueltype,6,loadlimit);
                 list2.add(obj1);
                 obj1.sort(list2);
                 }
                 break;
             case 2:
                 
             case 3:
                 System.exit(0);
                 
          }
        
         
	 }
	}
}
