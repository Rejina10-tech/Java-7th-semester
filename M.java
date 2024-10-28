public class M implements Runnable
 {
    String name;
    public  M()
    {

    }
    public  M(String n)
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
         M l1 = new M("Chat");
        Thread t1 = new Thread(l1);
        t1.start();
        M l2 = new M("File transfer");
        Thread t2 = new Thread(l2);
        t2.start();

    }
}
