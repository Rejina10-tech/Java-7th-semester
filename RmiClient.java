import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class RmiClient
{
	public static void main(String r[])
	{
		try
		{
			Registry reg = LocateRegistry.getRegistry();
			RmiAreaInterface stub = (RmiAreaInterface)reg.lookup("bmc");

			float ca = stub.circleArea(5.5f);
			float ra = stub.rectangleArea(4.5f, 5.5f);
			float sa = stub.squareArea(5.0f);

			System.out.println("Remote Method Called...");
			System.out.println("Circle : " + ca);
			System.out.println("Rectangle : " + ra);
			System.out.println("Square : " + sa);	
		}
		catch(Exception e)
		{

		}
	}
}