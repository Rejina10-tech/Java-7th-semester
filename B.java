public class B
{
   int a;
   int b;
  public B()
{
}
  public B(int p, int q)
 {
  a=p;
  b=q;
 }
  public int add()
  {
   return(a+b);
  }
  public static void main(String args[])
 {
  B m= new B(10,20);
  int c= m.add();
  System.out.println(c);
 }
}