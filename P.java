abstract class Shape 
{
    String name;
    float[] d={0.0f,0.0f,0.0f};
    public Shape()
    {

    }
    public void printName()
    {
        System.out.println(name);
    }
     abstract public void printArea();
    
}

public class P
{
    public static void main(String args[])
    {
      Shape s =new Shape() 
      {
        public void printArea()
        {
          super.printName();
          System.out.println(3.14f*d[0]*d[0]);
        }
      };
      s.name="TestCircle";
      s.d[0]=5.5f;
      s.printArea();


      Shape s1 =new Shape() 
      {
        public void printArea()
        {
          super.printName();
          System.out.println(d[0]*d[1]);
        }
      };
      s1.name="TestRect";
      s1.d[0]=5.5f;
      s1.d[1]=5.6f;
      s1.printArea();
    }
}


