import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String arr[]=s.split(",");
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            a[i]=Integer.parseInt(arr[i]);
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int finalcount=0;
        for(Integer i:a)
        {
            if(hm.containsKey(i))
            {
                if(hm.get(i)==1)
                {
                    hm.put(i,hm.get(i)+1);
                    finalcount++;
                }

            }
            else
            {
                hm.put(i,1);
                finalcount++;}
        }
        System.out.println("The length of the original array is:"+arr.length);
        System.out.println("After removing duplicates, the new length of the array is:"+finalcount);

    }
}
