interface Calculator
{
    public void add();
    public void subtract();
}
class IntegerCalculator implements Calculator
{
    int a,b;
    public IntegerCalculator()
    {

    }
    public IntegerCalculator(int x,int y)
    {
        a=x;
        b=y;
    }
    public void add()
    {
        System.out.println(a+b);
    }
    public void subtract()
    {
        System.out.println(a-b);
    }
}
class ComplexCalculator implements Calculator
{
 int a[];
 int b[];
  public ComplexCalculator()
  {

  }
  public ComplexCalculator(int[] a, int[] b){
    this.a=a;
    this.b=b;

  }
  public void add()
  {
    String c= (a[0]+b[0])+"+" + (a[1]+b[1])+"i";
    System.out.println(c);
  }
  public void subtract()
  {
    String c= (a[0]-b[0])+"+" + (a[1]-b[1])+"i";
    System.out.println(c);
  }
}

public class H 
{
    public static void main(String[] args)
     {
      IntegerCalculator ic =new IntegerCalculator(5,10);
      ic.add();
      ic.subtract();  
      int[] a ={10,20};
      int[] b ={5,6};
     ComplexCalculator cc = new ComplexCalculator(a,b);
     cc.add();
     cc.subtract();
    }
}
