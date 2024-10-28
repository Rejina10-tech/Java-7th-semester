import java.applet.*;
import java.awt.*;

//javac MyApplet.java
//appletviewer AppletTest.html

public class MyApplet extends Applet
{
	String s = "";

	public MyApplet()
	{
		
	}

	public void init()
	{
		System.out.println("init...");
		s = this.getParameter("m_string");
	}

	public void start()
	{
		System.out.println("start...");
	}

	public void paint(Graphics g)
	{
		System.out.println("paint...");
		g.setColor(Color.red);
		g.drawString(s, 200, 200);
		g.fillOval(100,100,50,50);
	}

	public void stop()
	{
		System.out.println("stop...");
	}

	public void destroy()
	{
		System.out.println("destroy...");
	}
}