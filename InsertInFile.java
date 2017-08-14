
package filehandling;

import java.io.*;
import java.util.Scanner;
public class InsertInFile 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        File f1 = new File("test.txt");
        f1.createNewFile();
        FileWriter fw = new FileWriter(f1);
        System.out.print("Enter the no. of students for which you want to record:");
        int n = sc.nextInt();
        fw.write("\n The Student Details are:\n");
        for(int i =0;i<n;i++)
        {
         System.out.println("Enter the name:");
         String name = sc.next();
         fw.write("\n    Name is:\n" + name);
         System.out.println("Enter the roll no.:");
         int roll = sc.nextInt();
         fw.write("\n    Roll No.is :\n " +roll + "");
        }
        fw.flush();
        fw.close();
        
        
        
       
        
        
    }
    
}
