class NestedIfDemo
{
   public static void main(String args[])
{
   int year;
   year = 1992;
  
   if(year%100 == 0)
 {
   if(year%400 == 0)
   System.out.println("It is a leap year");
   else
   System.out.println("It is not a leap year");
 }
else 
  {
   if(year%4 == 0)
   System.out.println("It is a leap year");
   else
   System.out.println("It is not a leap year");  
  }
}
}