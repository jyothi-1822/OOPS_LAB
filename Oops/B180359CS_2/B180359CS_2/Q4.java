import java.util.Scanner;
public class Q4 {
    public static int Largestpalindrome(String x,String y)
    {
        int ans=0;
        int t[][]=new int[x.length()+1][y.length()+1];
        for(int i=0;i<x.length()+1;i++)
            for(int j=0;j<y.length()+1;j++)
            {
                if(i==0||j==0)
                    t[i][j]=0;
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    t[i][j]=1+t[i-1][j-1];
                    ans=Math.max(ans,t[i][j]);

                }
                else
                    t[i][j]=0;
            }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y="";
        char[] try1 = x.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            y+=try1[i];
        System.out.println(Largestpalindrome(x,y));
    }
}
