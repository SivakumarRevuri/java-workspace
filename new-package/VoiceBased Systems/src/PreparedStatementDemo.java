
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo
{
	public static void main(String[] args)
	{
		Connection con=null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","shiva");
			PreparedStatement prep=con.prepareStatement("insert into user values(?,?,?,?)");
			prep.setString(1, "Akhil");
			prep.setInt(2, 24);
			prep.setString(3,"27000");
			prep.setString(4, "9873673763");
			prep.addBatch();
			prep.setString(1, "Ajit");
			prep.setInt(2, 25);
			prep.setString(3,"37000");
			prep.setString(4, "9453673763");
			prep.addBatch();
			int[] a=prep.executeBatch();

			for (int i = 0; i < a.length; i++) {
				System.out.println(a+"   ");
			}
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

