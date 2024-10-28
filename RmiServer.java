import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class RmiServer
{
	public static void main(String[] s)
	{
		try
		{
			RmiArea b = new RmiArea();
			
			RmiAreaInterface skeleton = (RmiAreaInterface)UnicastRemoteObject.exportObject(b, 12345);

			Registry reg = LocateRegistry.getRegistry();
			reg.bind("bmc", skeleton);

			System.out.println("Server Ready....skeleton uploaded to REGISTRY");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}