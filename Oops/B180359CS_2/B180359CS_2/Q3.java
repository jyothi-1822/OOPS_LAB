import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Q3 {
    public static void main(String args[])
    {
        LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }

    }
}
