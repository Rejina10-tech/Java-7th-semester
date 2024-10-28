import java.sql.*;

public class JDBCTest
{
	Connection con;
	Statement s; // for SELECT
	PreparedStatement ps; // for INSERT, UPDATE, DELETE
	ResultSet rs;
	public char[] selectData;

	public JDBCTest()
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

	public void selectData()
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
	}


	public void insertData()
	{

		try
		{
			ps = con.prepareStatement("INSERT INTO tbl_student(name,email,phone) VALUES(?, ?, ?)");

			ps.setString(1, "Sita");
			ps.setString(2, "Sita@w.com");
			ps.setString(3, "9804353544");

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}



	public void updateData()
	{

		try
		{
			ps = con.prepareStatement("UPDATE tbl_student SET name = ?, email = ?, phone = ? WHERE id = ?");

			ps.setString(1, "Harry");
			ps.setString(2, "harry@w.com");
			ps.setString(3, "330");
		
			ps.setInt(4, 3);

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}


	public void deleteData()
	{

		try
		{
			ps = con.prepareStatement("DELETE FROM tbl_student WHERE id = ?");
			ps.setInt(3, 3);

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}


	public static void main(String[] t)
	{
		JDBCTest j = new JDBCTest();

		//j.insertData();
		//j.updateData();
		j.deleteData();

		//j.selectData();

		j.closeConnection();
	}

}