class Student
{
int sid;
String sname;
static String collegeaddress;
}
class  Main_Stud
{
public static void main(String arg[])
{
Student sobj1=new Student();
sobj1.sid=100;
sobj1.sname="krathik";
sobj1.collegeaddress="hyd";

Student sobj2=new Student();
sobj2.sid=100;
sobj2.sname="chetan";

System.out.println("student 1 roll number"+sobj1.sid);
System.out.println("student 1 name"+sobj1.sname);
System.out.println("student 1 college address"+sobj1.collegeaddress);
System.out.println("student 2 roll number"+sobj2.sid);
System.out.println("student 2 name"+sobj2.sname);
System.out.println("student 2 college address"+sobj2.collegeaddress);
}
}