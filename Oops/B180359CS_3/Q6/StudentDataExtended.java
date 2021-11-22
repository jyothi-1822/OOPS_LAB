package package2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import package1.StudentData;


public class StudentDataExtended extends StudentData
{
    private String location;
    
	public void AddDetails(String id,String name,String location)
	{
		StudentDetails(id,name);
		this.location=location;
	}
	
    public void printDetails()
    {
        System.out.println(super.getid()+" "+super.getname()+" "+this.location);
    }
    
    


public static class sortbyid implements Comparator<StudentDataExtended>{
     public int compare(StudentDataExtended a, StudentDataExtended b) {
            return a.getid().compareTo(b.getid());
     }
       
}


public static void main(String[] args) {
    
	    System.out.print("Enter the no of Students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<StudentDataExtended> list=new ArrayList<StudentDataExtended>();
		String esc=sc.nextLine();
		for(int i=1;i<=n;i++)
		{
		    System.out.println("Enter the details of Student "+String.valueOf(i)+"(id,name,location):");
		    String S=sc.nextLine();
		    String details[]=S.split(" ");
			StudentDataExtended obj=new StudentDataExtended();
			obj.AddDetails(details[0],details[1],details[2]);
			list.add(obj);
			
		}
		Collections.sort(list,new sortbyid());
		
		System.out.println("Output:");
		
            for (StudentDataExtended obj : list) {
                obj.printDetails();
               
               
            }
	
	}
}
