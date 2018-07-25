import java.util.Scanner;
class Student2
{
 int sid;
 String sname;
 int m,p,c,total;
 float average;

 //pre defined class to accept the data from a user/keyboard
 Scanner scan = new Scanner(System.in);

 void accept_stud()
 {
  System.out.println("Enter the student name:");
  sname=scan.nextLine();
  System.out.println("Enter the roll number:");
  sid=scan.nextInt();
  System.out.println("enter the maths,phys,chem marks");
  m=scan.nextInt();
  p=scan.nextInt();
  c=scan.nextInt();
 
  total=m+p+c;
 }

  //function with return type and return statement
  float calculate_marks()
  {
    average=total/3;
    return average;
  } 

    void disp_Student()
    {
      System.out.println("Display student detail");
      System.out.println("student id:"+sid); 
      System.out.println("student name:"+sname); 
      System.out.println("student total marks:"+total);
      float result=calculate_marks();
      System.out.println("student id"+sid);    
    } //student class

class MainStudent2
{
public static void main(String [] ar)
  {
    Student stud = new Student();
    stud.accept_stud();
    stud.calculate_marks();
    stud.disp_Student(); 
  }
}   

}
