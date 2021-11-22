import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Q4{
public static class Employee
{
    private int id;
    private String name;
    private String department;
    private int salary;

    
    Employee(int id,String name,String department,int salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public int getsalary()
    {
        return this.salary;
    }
}
public static class Manager extends Employee
{
    private int bonus;
    Manager(int id,String name,String department,int salary,int bonus)
    {
        super(id,name,department,salary);
        this.bonus=bonus;
    }
    public Integer maxsalary()
    {
        return (this.bonus+super.salary);
    }
    public void printDetails()
    {
        System.out.println(super.id+" "+super.name+" "+super.department+" "+super.salary+" "+this.bonus);
    }
    
}

public static class sortbysalary implements Comparator<Manager>{
     public int compare(Manager a, Manager b) {
            return b.maxsalary().compareTo(a.maxsalary());
     }
       
}


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Manager> list=new ArrayList<Manager>();
		String esc=sc.nextLine();
		for(int i=1;i<=n;i++)
		{
		    String S=sc.nextLine();
		    String details[]=S.split(" ");
		    Manager obj=new Manager(Integer.parseInt(details[0]),details[1],details[2],Integer.parseInt(details[3]),Integer.parseInt(details[4]));
		    list.add(obj);
		}
		Collections.sort(list,new sortbysalary());
		System.out.println("Output:");
		int count=0;
            for (Manager obj : list) {
                obj.printDetails();
                count++;
                if(count==2)break;
               
            }
	
	}
}
