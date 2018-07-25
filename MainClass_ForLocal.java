class LocalVar
{
void addition()
{
//if you declare the variables within a function or parameter
//then those members are called local members
//and local members scope will be with functions
//we can't access outside of the function
int l=12,b=13;
int res=l*b;
}
void display()
{
System.out.println("result="+res);
}
}
class MainClass_ForLocal
{
public static void main(String arg[])
{
LocalVar lobs=new LocalVar();
lobs.addition();
lobs.display();
}
}
