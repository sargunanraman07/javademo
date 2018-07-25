class Rect
{
 float length,breadth;
 float area;
 //constructor
 Rect()
 {
  System.out.println("i am constructor");
  length=20.4f;
  breadth=40.6f;
 }
 float areaofRect()
  {
   area=length*breadth;
   return area;
  }
 void disp()
 {
   System.out.println("Area of rect="+areaofRect());
 }
}

class MainRect
{
public static void main(String args[])
 {
  //creating the object of a Rect class
  Rect robj=new Rect(); 
  robj.disp();
 }
}
 