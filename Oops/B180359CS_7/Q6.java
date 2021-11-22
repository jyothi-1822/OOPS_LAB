import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{ 
 int data;
 Node next;
}
 
class Queue
{
    
 Node front, rear; 
 int currentSize; 
 Queue()
 {
     front = null;
     rear = null;
     currentSize = 0;
 }

 public boolean isEmpty()
 {
     return (currentSize == 0);
 }
 
 
 public void dequeue()
 {
     try 
     {
         int data = front.data;
         front = front.next;
         currentSize--;
         System.out.println(data);
         //return data;
     }
     catch(Exception e)
     {
         rear=null;
         System.out.println("EmptyQueue");
     }
 }
 
 public void enqueue(int data)
{
     Node temp = rear;
     rear = new Node();
     rear.data = data;
     rear.next = null;
     if (isEmpty()) 
     {
         front = rear;
     }
     else 
     {
         temp.next = rear;
     }
     currentSize++;
     System.out.println("Success");
}
}
class Q6
{
public static void main(String a[])
    {
     Scanner s=new Scanner(System.in); 
     Queue obj = new Queue();
     while(true)
      {
          char c=s.next().charAt(0);
          //System.out.println(c);
          switch(c)
          {
              case 'E':
                  int n=s.nextInt();
                  obj.enqueue(n);
                  //System.out.println("Success");
                  String esc=s.nextLine();
                  break;
              case 'D':
                  obj.dequeue();
                  esc=s.nextLine();
                  break;
              default:
                  System.exit(0);
                  
          }
      
      }
    }
}