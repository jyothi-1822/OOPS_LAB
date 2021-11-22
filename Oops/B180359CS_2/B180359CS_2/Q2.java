import java.util.Scanner;
public class Q2 {
    public static void countwords_and_ascii(String s)
    {
        char arr[]=s.toCharArray();
        int countword=0;
        boolean isword=false;
        int endOfLine=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(arr[i])&&i!=endOfLine)
                isword=true;
            else if(!Character.isLetter(arr[i])&&isword)
            {
                countword++;
                isword=false;
            }
            else if(Character.isLetter(arr[i])&&i==endOfLine)
            {
                countword++;
            }


        }
        System.out.println("Words count is:"+countword);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("'"+arr[i]+"'"+" "+(int)arr[i]);
        }

    }
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        countwords_and_ascii(s);
    }
}
