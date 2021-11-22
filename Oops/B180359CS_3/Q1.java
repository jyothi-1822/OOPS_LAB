import java.io.*;
import java.util.Scanner;


public class Q1{
    static Node head;
     static class Node{
        char data;
        Node next;
        Node(char d)
        {
            data=d;
            next=null;
        }
    }
     Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static Q1 insert(Q1 list, char data)
    {
        
        Node newnode = new Node(data);
        newnode.next = null;
        if (list.head == null) {
            list.head = newnode;
        }
        else {
            
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newnode;
        }
        return list;
    }
    
    public static void printList(Q1 list)
    {
        Node currNode = list.head;
        System.out.println("The reversed list is: ");
		while (currNode.next != null) {
            System.out.print(currNode.data + "->");
			currNode = currNode.next;
        }
		System.out.print(currNode.data);
		
    }
    
    public static void main(String args[])
    {
        Q1 list=new Q1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes:");
        int n=sc.nextInt();
        int i=1;
        while(n-->0)
        {
            System.out.print("Enter the data in Node"+String.valueOf(i)+" : ");
            char ch = sc.next().charAt(0);
            list=insert(list,ch);
            i++;
        }
		Node dummy=head;
		head=list.reverse(dummy);
		printList(list);
		
        
    }
}

