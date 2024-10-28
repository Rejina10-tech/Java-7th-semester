import java.rmi.*;

public interface RmiAreaInterface extends Remote
{
	public float circleArea(float r) throws RemoteException;
	public float rectangleArea(float l, float b) throws RemoteException;
	public float squareArea(float l) throws RemoteException;
}