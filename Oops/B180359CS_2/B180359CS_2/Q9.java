import java.io.*;
import java.lang.*;
import java.util.*;
public class Q9 {
    public static class VideoStoreLauncher
        {
            String title;
            int rentedOrNot=0;

            public void addVideo(String title)
            {
                this.title=title;
                rentedOrNot=0;
            }

            public boolean checkAvailability()
            {
                if(rentedOrNot==1)
                    return false;
                return true;
            }

            public boolean rentAVideo()
            {
                if(checkAvailability()==true)
                {
                    rentedOrNot=1;
                    return true;
                }
                else return false;
            }
            public void returnVideo()
            {
                rentedOrNot=0;
            }
        }


        // main method
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Add video");
            System.out.println("2.Check availability");
            System.out.println("3.Rent a video");
            System.out.println("4.Return");
            System.out.println("5.List the inventory");
            System.out.println("6.Exit");
            ArrayList<VideoStoreLauncher> list=new ArrayList<>();
            while(true)
            {
                System.out.print("\nChoice: ");

                int n=sc.nextInt();
                if(n==1)
                {
                    System.out.println("Enter the number of titles you want to add");
                    int number=sc.nextInt();
                    System.out.println("Titles: ");
                    String buffer=sc.nextLine();
                    while(number!=0)
                    {
                        VideoStoreLauncher p=new VideoStoreLauncher();
                        String title=sc.nextLine();
                        p.addVideo(title);
                        list.add(p);
                        number--;
                    }

                }
                else if(n==2)
                {
                    String buffer=sc.nextLine();
                    System.out.println("Title:");
                    String movietitle=sc.nextLine();
                    int check=0;
                    for(VideoStoreLauncher p:list)
                    {
                        if((p.title).equals(movietitle))
                        {
                            if(p.checkAvailability()==true)
                            {
                                System.out.println("Available");
                            }
                            else{
                                System.out.println("NotAvailable");
                            }
                            check=1;
                            break;
                        }
                    }
                    if(check==0)
                    {
                        System.out.println("No such Video found");
                    }
                }
                else if(n==3)
                {
                    String buffer=sc.nextLine();
                    System.out.println("Title:");
                    String movietitle=sc.nextLine();
                    int check=0;
                    for(VideoStoreLauncher p:list)
                    {
                        if((p.title).equals(movietitle))
                        {
                            if(p.rentAVideo()==true)
                            {

                            }
                            else{
                                System.out.println("NotAvailable to rent");
                            }
                            check=1;
                            break;
                        }
                    }
                    if(check==0)
                    {
                        System.out.println("No such Video found");
                    }
                }
                else if(n==4)
                {
                    String buffer=sc.nextLine();
                    System.out.println("Title:");
                    String movietitle=sc.nextLine();
                    int check=0;
                    int foundandnotrented=0;
                    for(VideoStoreLauncher p:list)
                    {
                        if((p.title).equals(movietitle))
                        {
                            if(p.rentedOrNot==0)
                            {
                                System.out.println("This movie is not rented");
                                foundandnotrented=1;
                                break;
                            }
                            p.returnVideo();
                            check=1;
                            break;
                        }
                    }
                    if(check==0 && foundandnotrented==0)
                    {
                        System.out.println("No such Video found");
                    }
                }
                else if(n==5)
                {
                    String ans="";
                    for(VideoStoreLauncher p:list)
                    {
                        if(p.rentedOrNot==0)
                            ans+="\""+p.title+"\","+" ";
                    }
                    ans=ans.substring(0,ans.length()-2);
                    System.out.println(ans);
                }

                else break;

            }


        }
    }
