class Shape
{
    String name;
    public Shape()
    {

    }
    public Shape(String n)
    {
        name=n;
    }
    public void printName()
    {
        System.out.println(name);
    }
}
class circle extends Shape
{
    float r;
    public circle()
    {

    }
    public circle(float r, String n)
    {
        super(n);
        this.r=r;
    }
    public void printArea()
    {
    System.out.println(3.14f*r*r);
    }
    public void printName()
    {
     super.printName();
    }

}
public class C
{
  public static void main(String args[])
  {
   circle c1 = new circle(5.2f, "Red");
   c1.printArea();
   c1.printName();
  }
}