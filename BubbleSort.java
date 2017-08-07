import java.util.Scanner;

 class Sort
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int i,j;
  int A[] = new int[10];
  System.out.println("Program to sort the elements using Bubble Sort\n");
  System.out.println("Enter 10 numbers you want to sort:");
  for(i=0;i<10;i++)
  {
   A[i] = sc.nextInt();
  }
  for(i=0;i<9;i++)
  {
   for(j=0;j<9-i;j++)
   {
    if(A[j]>A[j+1])
    {
     int t = A[j];
     A[j] = A[j+1];
     A[j+1] = t;
    }
   }
  }
  System.out.println("\nSorted numbers are:");
  for(int k : A)
  {
   System.out.print(k+" ");
  }
 }
}