import java.util.*;
import java.lang.*;
import java.io.*;
interface Borrower
{
   void checkin();
   void checkout();
}
class Book 
{
    int bookID;
    String title;
    String author;
    
}
class TextBook extends Book
{
    int staus;
     borroweduser
}
class ReferenceBooks extends Book
{
    
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	 while(true)
	 {
	     System.out.println("1. Add Reference Book\n2. Add Text Book\n3. Check-Out\n4. Check-In\n5. List Books\n6. Exit\n");
         System.out.println("Enter your choice:");
         int n=sc.nextInt();
         String esc=sc.nextLine();
         int id;
         String title;
         String author;
         switch(n)
         {
             case 1:
                  System.out.println("Enter ID, Title and Author (Line by line)");
                  id=sc.nextInt();
                  title=sc.nextLine();
                  author=sc.nextLine();
                  break;
             case 2:
                   System.out.println("Enter ID, Title and Author (Line by line)");
                   id=sc.nextInt();
                   title=sc.nextLine();
                   author=sc.nextLine();
                   break;
             case 3:
                   System.out.println("Enter Book ID:");
                   id=sc.nextInt();
                   
         }
        
         
	 }
	}
}
