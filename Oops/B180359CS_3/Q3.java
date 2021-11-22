import java.io.*;
import java.util.*;
import java.lang.*;

public class Q3{
   public static class DepartmentMeetingScheduler
   {
      String title;
      String date;
      String start; 
      String end;
      String desc;
      DepartmentMeetingScheduler(String title,String date,String start,String end,String desc)
      {
          this.title=title;
          this.date=date;
          this.start=start;
          this.end=end;
          this.desc=desc;
      }
      
 
   }
   public static void  displayMeetings(ArrayList<DepartmentMeetingScheduler>list,String date)
   {
       for(DepartmentMeetingScheduler obj:list)
       {
           if(obj.date.equals(date))
           {
             
               System.out.println("On "+date+", from "+obj.start+ " to "+obj.end +" : " +obj.title+ " : "+obj.desc );
           }
       }
       
   }
   public static boolean scheduleMeeting(String date,String start,String end, ArrayList<DepartmentMeetingScheduler>list)
   {
       
       for(DepartmentMeetingScheduler obj:list)
       {
           String p[]=start.split(":");
           int begin=(Integer.parseInt(p[0]))*60+(Integer.parseInt(p[1]));
           String q[]=end.split(":");
           int stop=(Integer.parseInt(q[0]))*60+(Integer.parseInt(q[1]));
           if(obj.date.equals(date))
           {
               String s=obj.start;
               String a[]=s.split(":");
               int min=(Integer.parseInt(a[0]))*60+(Integer.parseInt(a[1]));
               String x=obj.end;
               String b[]=x.split(":");
               int max=(Integer.parseInt(b[0]))*60+(Integer.parseInt(b[1]));
               if((min<=begin&& begin<=max) || (min<=stop&& stop<=max))
               {
                   return true;
               }
              
           }
           
       }
       
       return false;
      
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       ArrayList<DepartmentMeetingScheduler> list=new ArrayList<DepartmentMeetingScheduler>();
	       System.out.println("1. Schedule Meeting");
		   System.out.println("2. List Meetings");
       for(;;)
       {
		   
		   System.out.println();
           System.out.print("Enter your choice :");
           int n=sc.nextInt();
           int flag=0;
		   
           switch(n)
           {
               case 1:
                   String esc=sc.nextLine();
                   System.out.print("Title -");
                   String title=sc.nextLine();
                   System.out.print("Date -");
                   String date=sc.nextLine();
                   System.out.print("Start time -");
                   String start=sc.nextLine();
                   System.out.print("End time -");
                   String end=sc.nextLine();
                   System.out.print("Description - ");
                   String descr=sc.nextLine();
                   if(scheduleMeeting(date,start,end,list)==false)
                   {
                    DepartmentMeetingScheduler obj=new DepartmentMeetingScheduler(title,date,start,end,descr);
                    list.add(obj);
                    System.out.println("Scheduled successfully");
                   }
                   else
                   {
                       System.out.println("Collision! Already another meeting is scheduled");
                   }
                   
                   break;
               case 2:
			       String esc1=sc.nextLine();
                   System.out.print("Date -");            //ASSUMPTION:When choice is 2 is given the console asks for the date to list all the meeeting held on that day
                   String date1=sc.nextLine();
                   displayMeetings(list,date1);
                   break;
               case 3:                                   //ASSUMPTIOM: taken an additional choice 3 for termination condition
                   flag=1;
                   break;
           }
           if(flag==1)break;
       }
    }
}