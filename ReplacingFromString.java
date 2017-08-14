
package replacing.from.string;

import java.util.Scanner;
public class ReplacingFromString 
{
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String  S;
        System.out.println("Program to replace blank space from @ in the String\n");
        System.out.println("Enter the String:");
        S = sc.nextLine();
        System.out.println("\nEntered String is:\n" + S);
        System.out.println("\nAfter operation String become:\n" + S.replaceAll(" ","@"));
        
    }
    
}
