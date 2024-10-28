class Outer
{
public Outer()
{

}
public Outer(String n)
{
   Inner i= new Inner(" Inner class");
    i.printName(); 
}
   class Inner 
{
    String name;
    public Inner()
    {

    }
    public Inner(String n)
    {
        name=n;
    }
    public void printName()
    {
      System.out.println(name);
    }
}
}
public class N 
{

    public static void main(String args[])
    {
     //Inner i= new Inner(" Inner class");
     //i.printName();
      Outer o = new Outer("Hello");
    }
}
