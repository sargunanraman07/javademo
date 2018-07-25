import java.util.*;
class LogicalorDemo
{ 
   public static void main(String args[])
   {
    String ch;
    System.out.println("Enter a character");
    Scanner scan=new Scanner(System.in);
    ch = scan.next();
    if((ch == "A")|| (ch == "E")|| (ch =="I") || (ch =="O") || (ch == "u"))
    System.out.println("vowel");
    else
    System.out.println("consonant"); 
   }
}
