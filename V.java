import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class V
{
    public void WriteToFile()
    {
        try
        {
        FileOutputStream fos = new FileOutputStream("ABC.txt");
        String s= "hello";
        fos.write(s.getBytes());
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
        FileInputStream fis= new FileInputStream("ABC.txt");
        byte[] b= new byte[fis.available()];
        fis.read(b);
        System.out.println(new String(b));
        fis.close();
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
     V v =new V();
     v.WriteToFile();
     v.ReadFromFile();
    }
}
