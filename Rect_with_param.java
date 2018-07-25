class Rect_with_param
{
 float length,breadth;
 //constructor
 Rect_with_param(float len,float brd)
 { 
  System.out.println("i am constructor");
  length=len;
  breadth=brd; 
 } 
 float areaofRect()
 {
  float area;
  area=length*breadth;
  return area;
 }
 void disp()
 {
   System.out.println("Area of rect="+areaofRect()); 
 }
}
class Constructor_with_param
 {
  public static void main(String args[])
  {
   //creating the object of Rect class
  Rect_with_param robj=new Rect_with_param(23.4f,56.7f);
  robj.disp();
  }
 }
