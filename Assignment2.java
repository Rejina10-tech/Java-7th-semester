import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class TestFrame extends JFrame implements ActionListener
{
    JButton b1;
    
    public TestFrame() {

        b1 = new JButton("b1");
        
        b1.addActionListener(this);
        BorderLayout bl=new BorderLayout();
        this.getContentPane().setLayout(bl);
        this.getContentPane().add(b1,BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {
        JDBCTest j = new JDBCTest();

        System.out.println(j.selectData);

    }
}


public class Assignment2
{
    
	Connection con;
	Statement s; // for SELECT
	PreparedStatement ps; // for INSERT, UPDATE, DELETE
	ResultSet rs;

	public Assignment2()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // loading the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost/test_db?user=root&password="); // establishing the connection	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}		
	}


	public void closeConnection()
	{
		try
		{
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
	}

	public boolean selectData()
	{
		try
		{
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM tbl_student");

			while(rs.next())
			{
				System.out.println("NAME : " + rs.getString("name"));
				System.out.println("EMAIL : " + rs.getString("email"));
				System.out.println("PHONE : " + rs.getString("phone"));
				System.out.println("--------------------------------------------");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
        return false;
	}
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

        JDBCTest j = new JDBCTest();
        j.selectData();



    }
}
