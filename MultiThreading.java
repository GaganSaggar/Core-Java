
package multithreading;

import java.util.Scanner;
public class MultiThreading extends Thread 
{
    int num1,num2;
   static MultiThreading m = new MultiThreading();
     Scanner sc = new Scanner(System.in);
    @Override
    public void run()
    {
        System.out.println("Enter the two no.:" );
        m.num1 = sc.nextInt();
        m.num2 = sc.nextInt();
        
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Program of Multi Threading");
       m.start();
       m.join();
       System.out.println("Sum is:" + (m.num1+m.num2) );
       
       
        
        
    }
    
}
