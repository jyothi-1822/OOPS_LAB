import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Q5{
public static class Person
{
    private String person_name;
    Person(String name)
    {
        this.person_name=name;
    }
    public String getname()
    {
        return this.person_name;
    }
}
public static class Patient extends Person
{
    private String patient_id;
    Patient(String name,String id)
    {
        super(name);
        this.patient_id=id;
    }
    public Integer getage()
    {
    String age[]=this.patient_id.split("-");
    return Integer.parseInt(age[1]);
    }
    public void printDetails()
    {
        System.out.println(this.patient_id+" "+super.getname());
    }
    
}

public static class sortbyid implements Comparator<Patient> {
        public int compare(Patient a, Patient b) {
            return b.getage().compareTo(a.getage());
        }
}

	public static void main(String[] args) {
		System.out.print("Enter the number of patients:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println();
		ArrayList<Patient> list=new ArrayList<Patient>();
		
		for(int i=1;i<=n;i++)
		{
		    
		    System.out.println("Enter the details of patient "+String.valueOf(i)+":");
		    System.out.print("Name:");
		    String name=sc.next();
		    System.out.print("Patient ID:");
		    String id=sc.next();
		    System.out.println();
		    Patient obj=new Patient(name,id);
		    list.add(obj);
		}
		Collections.sort(list,new sortbyid());
		System.out.println("Output:");
            for (Patient obj : list) {
               obj.printDetails();
            }
	}
}
