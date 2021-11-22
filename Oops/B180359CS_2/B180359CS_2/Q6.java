import java.util.Scanner;
import java.util.ArrayList;
public class Q6 {
    public static class Student
    {
      private String name;
      private String roll_no;
      private int percentage;
      public Student(String name,String roll_no,int percentage)
      {
          this.name=name;
          this.roll_no=roll_no;
          this.percentage=percentage;
      }
        public String getName(){
            return this.name;
        }
        public String getRoll(){
            return this.roll_no;
        }

        public int getCgpa(){
            return this.percentage;
        }
        public float member(){
          return percentage*(float)9.5;
        }
        public void printdetails()
        {
            if((this.member()-(int)this.member())==0.0)
                System.out.println(this.getName() + " " + this.getRoll() + " "+this.getCgpa()+" "+(int)this.member()+"%");
            else
                System.out.println(this.getName() + " " + this.getRoll() + " "+this.getCgpa()+" "+this.member()+"%");
        }


    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n=sc.nextInt();
        String es=sc.nextLine();
        ArrayList<Student> arraylist=new ArrayList<Student>();
        System.out.println("Enter the Student Details");

        while(n-->0)
        {

            String s=sc.nextLine();
            String parts[]=s.split(" ");
            String name=parts[0];
            String roll=parts[1];
            int per=Integer.parseInt(parts[2]);
            Student obj=new Student(name,roll,per);
            arraylist.add(obj);

        }
        System.out.println("Sample Output:");
            for(Student obj:arraylist)
            {
                obj.printdetails();
            }
    }
}
