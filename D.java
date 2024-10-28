class Device
{
    String name;

    public Device()
    {

    }
    public Device( String n)
    {
     name=n;
    }
    public void printDetails()
    {
        System.out.println(name);
    }
}
class Calculator extends Device
{
    public Calculator()
    {

    }
    public Calculator(String n)
    {
        super(n);
    }

    public void add(int a, int b)
    {
    System.out.println(a+b);
    }

    public void add(float a, float b)
    {
    System.out.println(a+b);
    }

    public void printDetails()
    {
    super.printDetails();
    }
}


public class D
{
  public static void main(String args[])
  {
   Calculator c =new Calculator("A"); 
   c.printDetails();
   c.add(5,10);
   c.add(5.99f,6.10f);
  }
}