import java.util.Scanner;
 class A
{
 static void fact(int n)
 {
  int i,f=1;
  for(i=1;i<=n;i++)
  {
   f=f*i;
  }
  System.out.println("Factorial of the entered number is:"+f);
 }
 public static void main(String[] args)
 {
  int a,ch;
  Scanner sc = new Scanner(System.in);
  System.out.println("Program to calculate the Factorial of the no."); 
 do
  {
  System.out.println("Enter the number whose factorial you want to calculate");
  a=sc.nextInt();
  fact(a);
  System.out.println("Do you want to continue:  (1)Yes   (2)No");
  ch=sc.nextInt();
  }while(ch!=2);
  System.out.println("Thank you");
 }
}