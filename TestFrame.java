// Main-Class: bmctest.TestFrame[ENTER]
// jar cfm MyJar.jar abc1.txt bmctest/*
// java -jar MyJar.jar



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TestCanvas extends Canvas implements Runnable
{
	int x;
	int y;

	int w;
	int h;

	Color c;

	public TestCanvas(int w, int h, Color c)
	{
		this.x = 0;
		this.y = 0;
		this.w = w;
		this.h = h;
		this.c = c;
	}

	public void paint(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x, y, w, h);
	}

	public void run()
	{
		Random random = new Random();

		while(true)
		{

			try
			{
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				
			}

			x = random.nextInt(300);
			y = random.nextInt(300);
			repaint();

		}
	}

}

public class TestFrame extends JFrame implements ActionListener
{
	TestCanvas tp;
	JButton btn;
	JTextField txt;


	TestFrame()
	{
		tp = new TestCanvas(100, 100, Color.blue);
		btn = new JButton("Ok");
		txt = new JTextField();

		btn.addActionListener(this);

		this.getContentPane().setLayout(new GridBagLayout());

		this.getContentPane().add(txt, new GridBagConstraints(0,0,1,1,0.8,0.1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0), 0, 0));
		this.getContentPane().add(btn, new GridBagConstraints(1,0,1,1,0.2,0.1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0), 0, 0));
		this.getContentPane().add(tp, new GridBagConstraints(0,1,2,1,1,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 0, 0));


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);

		Thread t1 = new Thread(tp);
		t1.start();
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = txt.getText();

		try
		{
			int n = Integer.parseInt(s);

			tp.w = n;	
			tp.h = n;	

			tp.repaint();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, "Invalid Input !!!");
		}
		
	}

	public static void main(String[] r)
	{
		TestFrame f = new TestFrame();
	}


}