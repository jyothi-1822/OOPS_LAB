import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class Q7 {
    public static class Student {

        private String rollNumber;
        private String fullName;
        private String height;
        private String weight;

        public void readStudent(String rollNumber, String fullName, String height, String weight) {
            this.rollNumber = rollNumber;
            this.fullName = fullName;
            this.height = height;
            this.weight = weight;
        }
        public void printStudentDetails(){
            System.out.println(this.rollNumber + "," + this.fullName + "," + this.height + "," + this.weight);

        }
    }

    public static class Sortbyheight implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.height.compareTo(b.height);
        }
    }
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students:");
            int n = sc.nextInt();
            String es = sc.nextLine();
            ArrayList<Student> arraylist = new ArrayList<Student>();
            System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");

            while (n-- > 0) {
                String s = sc.nextLine();
                String parts[] = s.split(",");
                Student obj = new Student();
                obj.readStudent(parts[0], parts[1], parts[2], parts[3]);
                arraylist.add(obj);

            }
            Collections.sort(arraylist, new Sortbyheight());
            System.out.println("Output:");
            for (Student obj : arraylist) {
               obj.printStudentDetails();
            }
        }
}
