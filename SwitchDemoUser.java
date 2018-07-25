import java.util.*;
class SwitchDemoUser
{
 
  public static void main(String args[])
   {
     char ch;
     System.out.println ("Enter a character");
     Scanner scanner = new Scanner(System.in);
     ch=scanner.next().charAt(0);
     switch(ch)
      {
        case'A':
        case'a' :
        System.out.println("vowel");
        break;

        case'E':
        case'e':
        System.out.println("vowel");
        break; 

        case'I':
        case'i':
        System.out.println("vowel");
        break;

        case'O':
        case'o':
        System.out.println("vowel");
        break;

        case'U':
        case'u':
        System.out.println("vowel");
        break;

        default:
        System.out.println("consonant");     
                
      }
   }
 
}

