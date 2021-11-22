import java.util.Scanner;
import java.util.ArrayList;
public class Q8 {
    enum BusType{
        O,F,L;
    }
    public static class Train{
        int busno;
        String from;
        String to;
        int distance;
        BusType type;
        public void Train1(int busno,String from,String to,int distance)
        {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            this.type=BusType.valueOf("O");
        }
        public void Train2(int busno,String from,String to,int distance,String type)
        {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            this.type=BusType.valueOf(type);
        }
        public int calcfare()
        {
            switch(type){
                case O:
                    return 10*distance;

                case F:
                    return 20*distance;
                case L:
                    return 24*distance;

            }
            return 0;
        }
        public void printdetails()
        {
            System.out.println(this.busno+" "+this.from+" "+this.to+" "+this.distance+" "+this.type+" "+this.calcfare());
        }


    }
    public static void main(String args[])
    {
        ArrayList<Train>list=new ArrayList<Train>();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("\n");
            System.out.println("1-Add details");
            System.out.println("2-Show details");
            System.out.println("3-Exit");

            System.out.print("Enter choice ");
            int n=sc.nextInt();
            String es=sc.nextLine();

            switch(n)
            {
                case 1:
                    System.out.println("Enter bus details(Busno,from,to,distance,type)");
                    String s=sc.nextLine();
                    String parts[]=s.split(" ");
                    int findlength=parts.length;
                    Train obj=new Train();
                    if(findlength==4)
                        obj.Train1(Integer.parseInt(parts[0]),parts[1],parts[2],Integer.parseInt(parts[3]));
                    else
                        obj.Train2(Integer.parseInt(parts[0]),parts[1],parts[2],Integer.parseInt(parts[3]),parts[4]);
                    list.add(obj);
                    break;
                case 2:
                    System.out.println("Bus Details (Busno,from,to,distance,type, fare)");
                    for(Train x:list)
                    {
                        x.printdetails();
                    }
                    break;
                case 3:
                    break;
            }
            if(n==3)
                break;
        }
    }
}
