import java.rmi.*;

//start rmiregistry
//java  RmiServer
//java  RmiClient

public class RmiArea implements RmiAreaInterface
{
	public float circleArea(float r) throws RemoteException
	{
		return 3.14f * r * r;
	}

	public float rectangleArea(float l, float b) throws RemoteException
	{
		return l * b;
	}

	public float squareArea(float l) throws RemoteException
	{
		return l * l;
	}
}