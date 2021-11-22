import java.util.*;
import java.lang.*;
import java.io.*;


class Q4
{
public static void main(String a[])throws Exception
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int x=str.length();
    if(x%8!=0)
    {
        System.out.println("Incorrect Input");
        return;
    }
    int j=0;
    int k=0;
    int p=0;
    int q=0;
    for(int i=0;i<x;i++)
    {
        k++;
        if(k==8)
        {
            k=0;
            String req=str.substring(j,i+1);
            int n=Integer.parseInt(req,2);
            j=i+1;
            if(p==1)
            {
               int z=n^q;
		       char ch=(char)z;
		       System.out.print(ch); 
            }
            if(p==0)
            {
              p=1;
              q=n;
            }
        }
    }
}
}
   
