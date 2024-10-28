import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
    Socket s;
    ServerSocket ss;
    ObjectInputStream ois;

    public MyServer() {
        try {
            ss = new ServerSocket(7000);
        } catch (Exception e) {

        }
    }

    public void run() {
        System.out.println("Starting server");
        while (true) {
            try {
                s = ss.accept();
                ois = new ObjectInputStream(s.getInputStream());
                Message m = (Message) ois.readObject();
                System.out.println(m.message);
                ois.close();
                s.close();
            } catch (Exception e) {

            }

        }
    }

    public static void main(String[] args) {
        MyServer ms = new MyServer();
        ms.start();
    }
}
