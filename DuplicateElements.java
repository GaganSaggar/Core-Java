package arraylist;


import java.util.Scanner;
public class DuplicateElements 
{
    public static void main(String[] args) 
    {
        int i,count=0;
        int B[] = new int[10];
        int C[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for( i =0;i<10;i++)
        {
            int j = sc.nextInt();
            B[i] = j;
        }
        System.out.println("Elements are:");
        for(i=0;i<10;i++)
        {
        System.out.print(B[i]+" ");
        }
        System.out.println();
        for(i=0;i<10;i++)
        {
            count = 0;
            int temp = B[i];
            for(int j =0;j<10;j++)
            {
             if(B[j] == temp)
             {
                count++;
             }
            }
            C[i] = count;
        }
        System.out.println("Duplicate Elements are:");
        for(i=0;i<10;i++)
        {
            if(C[i]>1) 
            {
               System.out.println(B[i]+" :" + C[i]);
            }
        }
    }
    
}
