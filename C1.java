//dynamic method mismatch


class A1
{
    public A1()
    {

    }
   public void printDetails()
   {
    System.out.println("This is A1");
   }
}

class B1 extends A1
{
    public B1()
    {

    }
   public void printDetails()
   {
    System.out.println("This is B1");
   }
}


public class C1 
{
   public static void main(String[] args) 
   {
    A1 a = new A1();
    A1 b = new B1();  //parent class ko context dekhi child class banauna milcha
    //a= (B1)a;
    a=b;
    a.printDetails();
    b.printDetails();
   } 
}
