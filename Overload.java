class Add
{
  Add()
  {
   System.out.println("constructor without any parameter");
   System.out.println("constructor with overloaded");
  }
  Add(int a,int b)
  {
   System.out.println("sum of integer numbers="+(a+b)); 
  }
  Add(float a,float b)
  {
   System.out.println("sum of float numbers="+(a+b));
  }
  
}
class Overload
{
 public static void main(String ar[])
 {
  new Add(23,24); //anymous object
  new Add(3.4f,4.5f);
  new Add(); 
 } 
}
