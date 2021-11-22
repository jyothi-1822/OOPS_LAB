import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.File;
import java.util.Scanner;

class Q2
{
public static void main(String a[])throws Exception
{
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    try
    {
    File file = new File(str);
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine())
      {
         
         String eachline=sc.nextLine();
		 int flag=0;
         try 
         {
            for(int i=0;i<eachline.length();i++)
			{
                if(eachline.charAt(i)>='0'&&eachline.charAt(i)<='9')
                 flag=1;   
                else
                 flag=0;   
			}
			if(flag==0)
				throw new NumberFormatException("OtherCharactersFound");
			else
				System.out.println(eachline);
        
         } 
         catch(NumberFormatException nfe)
         {
             System.out.println("OtherCharactersFound");
         } 
         
      }
	}
	  catch(FileNotFoundException e)
    {
        System.out.println("FIleNotFoundException: No such file found.Enter a valid input file");
    }
  }
}
     
    
