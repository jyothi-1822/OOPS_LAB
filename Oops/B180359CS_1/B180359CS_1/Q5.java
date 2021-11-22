import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the array, N=");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int i=0;
        int s=size;
        while(size-->0)
        {
            arr[i]=sc.nextInt();
            i++;

        }
        int temp=0;
        for(int a=0;a<arr.length;a++)
        {
            for(int b=a+1;b<arr.length;b++)
            {
                if(arr[a]<arr[b])
                {
                    temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }
            }
        }
        for(int p=0;p<s;p++)
        {
            System.out.print(arr[p]+" ");
        }
    }
}
