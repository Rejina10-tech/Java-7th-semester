import java.io.Serializable;

public class Message implements Serializable
{
    String message;
    public Message()
    {

    }
    public Message(String m)
    {
        message=m;
    }
}
