import java.util.*;
import java.lang.*;
import java.io.*;


class Q5
{
public static void main(String a[])
    {
	 int board[][]=new int[9][9];
	 
     Scanner sc=new Scanner(System.in);
     int i=sc.nextInt();
     int j=sc.nextInt();
     int k=sc.nextInt();
     try{
		   int curr=board[i][j];
           for(int p=k;p>=0;p--)
           {
            String s=sc.nextLine();
            String str[]=s.split(" ");
            if(str[0].equals("Up")||str[0].equals("up"))
            {
                //System.out.println("hello");
             curr=board[i-Integer.parseInt(str[1])][j]; 
             i=i-Integer.parseInt(str[1]);
             j=j;
             //System.out.println(i+" "+j);
            }
            else if(str[0].equals("Right")||str[0].equals("right"))
            {
                curr=board[i][j+Integer.parseInt(str[1])];
                i=i;
                j=j+Integer.parseInt(str[1]);
                //System.out.println(i+" "+j);
            }
            else if(str[0].equals("Down")||str[0].equals("down"))
            {
                curr=board[i+Integer.parseInt(str[1])][j];
                i=i+Integer.parseInt(str[1]);
                j=j;
                //System.out.println(i+" "+j);
                
            }
            else if(str[0].equals("Left")||str[0].equals("left"))
            {
                curr=board[i][j-Integer.parseInt(str[1])];
                i=i;
                j=j-Integer.parseInt(str[1]);
                //System.out.println(i+" "+j);
            }
           }
           
        System.out.println("["+i+","+j+"]");
        
        }
        catch(Exception e)
        {
            System.out.println("Overflow");
        }
        finally
        {
            sc.close();
        }
        
    
     
     
    }
}