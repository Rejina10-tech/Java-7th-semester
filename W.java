import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    String name;
    int roll;
    transient String username;
    public Student()
    {

    }
    public Student(String n,int r,String u)
    {
        name=n;
        roll=r;
        username=u;
    }
}
public class W
{
    public void WriteToFile()
    {
        try
        {
        Student s= new Student("Rejina",1,"rj");  
        FileOutputStream fos = new FileOutputStream("ABC.txt");
        ObjectOutput oos= new ObjectOutputStream(fos);
        oos.writeObject(s);
        fos.close();
        }
        catch(FileNotFoundException fe)
        {

        }
        catch(IOException IO)
        {

        }
    }
    public void ReadFromFile()
    {
        try{
        FileInputStream fis = new FileInputStream( "abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s= (Student)ois.readObject();
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.username);
        ois.close();
        fis.close();


        }
        catch(ClassNotFoundException CF)
        {

        }
        catch(FileNotFoundException fe)
        {

        }
        catch(IOException IO)
        {

        }
    }
    public static void main(String args[])
    {
     W w =new W();
     w.WriteToFile();
     w.ReadFromFile();
    }
}
