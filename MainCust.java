class Customer
{
//instance variable is also called as global variable
int cid;
String cname;

void_accept()
{
cid=100;
cname="bharathi";
}
void disp()
{
System.out.println("customer id:"+cid);
System.out.println("customer name:"+cname);
}
}

class MainCust
{
public static void main(String arg[])
{
Customer cust1=new Customer();
cust.void_accept();
cust.disp();
}
}
