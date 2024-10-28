import java.util.InputMismatchException;
import java.util.Scanner;
public class K
{
    public void  divide()
    {
    try
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        float a =sc.nextFloat();
        System.out.println("Enter denominator");
        float b= sc.nextFloat();
        checkZero(b);
        float c=a/b;
        System.out.println(c);
    }
    catch(InputMismatchException in)
    {
     System.out.println("Please enter number");
    }
    catch(IllegalArgumentException in)
    {
     System.out.println("Please enter a non-zero value");
    }
    
    
    finally{
        System.out.println("End");
    }
}

   public void checkZero(float m) throws IllegalArgumentException
   {
    if(m==0)
    {
        throw new IllegalArgumentException();
    }
   }
  public static void main(String args[])  
  {
    K k = new K();
    k.divide();
  }
}
