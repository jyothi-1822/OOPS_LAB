import java.util.*;
import java.lang.*;
import java.io.*;
interface OrderStudents
{
    void OrderByRollno(ArrayList<Student> list);
    void OrderByName(ArrayList<Student> list);
}
class Sortbyroll implements Comparator<Student> {
    
    public int compare(Student a, Student b)
    {
        return a.roll - b.roll;
    }
}
class Sortbyname implements Comparator<Student> {
   
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
class Student implements OrderStudents
{
    int roll;
    String name;
    String address;
    public void initialise(int roll,String name,String address)
    {
        this.roll=roll;
        this.name=name;
        this.address=address;
    }
    public void OrderByRollno(ArrayList<Student> list)
    {
        Collections.sort(list, new Sortbyroll());
        for (Student obj:list)
            System.out.println(obj.roll+" "+obj.name+" "+obj.address);
  
    }
    public void OrderByName(ArrayList<Student> list)
    {
        Collections.sort(list, new Sortbyname());
         for (Student obj:list)
            System.out.println(obj.roll+" "+obj.name+" "+obj.address);
  
    }
}
public class Q5
{
	public static void main(String[] args)throws Exception {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String esc=sc.nextLine();
	 ArrayList<Student> list=new ArrayList<Student>();
	 while(n-->0)
	 {
	     String s=sc.nextLine();
	     String details[]=s.split(" ");
	     Student obj=new Student();
	     obj.initialise(Integer.parseInt(details[0]),details[1],details[2]);
	     list.add(obj);
	 }
	 Student obj1=new Student();
	 System.out.println("Output:");
	 //System.out.println();
	 System.out.println("//Sorted by Rollno");
	 obj1.OrderByRollno(list);
	 System.out.println();
	 System.out.println("//Sorted by Name");
	 obj1.OrderByName(list);
	 
	}
}
