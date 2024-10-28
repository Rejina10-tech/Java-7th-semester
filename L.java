public class L extends Thread
 {
    String name;
    public  L()
    {

    }
    public  L(String n)
    {
    name=n;
    }
    public void run()
    {
     while(true)
     {
      try
      {
      Thread.sleep(1000);
      }
      catch(InterruptedException IE)
      {

      }
      System.out.println(name);
     }
    }
    public static void main(String args[])
    {
        L l1 = new L("Chat");
        l1.start();
        L l2 = new L("File transfer");
        l2.start();

    }
}
