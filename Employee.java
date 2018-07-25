class Employee 
{
 //instance variable
 int eid;
 String ename;
 double sal;

 //function with parameter/arguments(local variables)

 void accept_Emp(int eno,String empname,double salary)
 {
  eid=eno;
  ename=empname;
  sal=salary;
 } 
 void disp_Emp()
 {
  System.out.println("Empid=\t"+eid+"\t Ename=\t"+ename+"\t salary\t"+sal);
 }
public static void main(String [] ar)
 {
  Employee eobj = new Employee ();
  eobj.accept_Emp(100,"krathik",12000); //passing a value to function
  eobj.disp_Emp(); 
 }
}