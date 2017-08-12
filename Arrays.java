
package arrays;
import java.util.Scanner;

public class Arrays 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int s = 0,b;
        int M[] = new int[5];
        System.out.println("Program to display the Marksheet using Arrays");
        do
        {
        System.out.println("Enter the name of the student:");
        name = sc.next();
        System.out.println();
        System.out.println("Enter the Five subject marks:");
        for(int i =0;i<5;i++)
        {
            M[i] = sc.nextInt();
        }
        for(int i = 0;i<5;i++)
        {
            s = s + M[i];
        }
        System.out.println("Total Marks :" + s);
        int p = s/5;
        System.out.println("Percentage:" + p);
        if(p>=50)
        {
            System.out.println("Status : Pass");
        }
        else
        {
            System.out.println("Status : Fail");
        }
        System.out.println("Do you want to continue: (1)Yes  (2)No");
         b = sc.nextInt();
        
       }while(b!=2);
        System.out.println("Thank You");
        
            
        
       
        
    }
    
}
