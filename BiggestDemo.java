import java.util.*;
class BiggestDemo
{ 
  public static void main(String args[])
  {
    int num1,num2,num3;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter num 1");
    num1= scanner.nextInt();

    System.out.println("Enter num 2");
    num2=scanner.nextInt();

    System.out.println("Enter num 3");
    num3=scanner.nextInt();
    
    if(num1>num2 && num1>num3)
      {
         System.out.println("num1 is biggest");

      }
    else if (num2>num3)
      { 
        System.out.println("num2 is biggest");
      }
    else
      System.out.println("num3 is biggest");   
  }
}