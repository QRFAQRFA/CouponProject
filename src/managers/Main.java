package managers;

import java.io.ObjectInputStream.GetField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends ConnectionPool
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		ResultSet rs = null;
		ResultSet rs1 = null;
		Statement statement = null;
		Statement statement1 = null;
		
		try {
			statement = getConnection().createStatement();
			statement1 = getConnection().createStatement();
			
			rs = statement.executeQuery("select * from company");
			rs1 = statement1.executeQuery("select * from company");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();
		
					    System.out.println("querying SELECT * FROM XXX");
					    int columnsNumber = rsmd.getColumnCount();
					    while (rs.next()) {
					        for (int i = 1; i <= columnsNumber; i++) {
					            if (i > 1) System.out.print(",  ");
					            String columnValue = rs.getString(i);
					            System.out.print(columnValue + " " + rsmd.getColumnName(i));
					        }
					        System.out.println("");
					    }
					    rs.beforeFirst();
					    
					    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

}
