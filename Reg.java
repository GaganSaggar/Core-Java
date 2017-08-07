import java.util.Scanner;
class Registeration
{
  String name;
  String pass;
  String uname;
  String age;
  void Register()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("-----REGISTERATION FORM-----");
  System.out.print("Enter your Name:");
  name = sc.next();
  System.out.print("Enter your age:");
  age = sc.next();
  System.out.print("Enter your Username:");
  uname = sc.next();
  System.out.print("Enter your Password:");
  pass = sc.next();
 }
 void Display()
 {
  System.out.println();
  System.out.println("Your Details are:");
  System.out.println("Name:"+name);
  System.out.println("Age:"+age);
 }
}
class Login extends Registeration
{
 String Uname;
 String Pass;
 void Log()
 {
  System.out.println("-----LOGIN FORM-----");
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your Username:");
  Uname = sc.next();
  System.out.print("Enter your Password:");
  Pass = sc.next();
 }
 void Validate()
 {
  if((Uname.equals(uname))&&(Pass.equals(pass)))
  {
   Display();
  }
  else
  {
   System.out.println("Wrong Username or Password");
  }
 }
 public static void main(String[] args)
 {
  Login L = new Login();
  L.Register();
  L.Log();
  L.Validate();
 }
}