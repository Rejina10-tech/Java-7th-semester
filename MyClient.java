import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient
 {
    Socket s;
    ObjectOutputStream oos;
   public MyClient()
   {

   }
   void sendMessage()
   {
    try{
    System.out.println("Sending Message");
    Message m = new Message("Test");
    s= new Socket("192.168.0.122",7000);
    oos=new ObjectOutputStream(s.getOutputStream());
    oos.writeObject(m);
    oos.close();
    s.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
   }

    public static void main(String arg[])
    {
      MyClient mc = new MyClient();
        mc.sendMessage();
    }
}
