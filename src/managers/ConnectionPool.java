package managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool 
{

	
	private static Connection conn = null;

	private final static String url = "jdbc:mysql://localhost:3306/";

	private final static String dbName = "couponsDB";

	private final static String driver = "com.mysql.jdbc.Driver";

	private final static String userName = "aviyaomesi"; 

	private final static String password = "010890aviya"; 
	
	public ConnectionPool()
	{
		
	}
	
	
	


	
public static Connection getConnection() 
{


	      try {
			Class.forName(driver).newInstance();
			System.out.println("forName");
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			String string = "driver failed! \n ";
			System.out.println(string);
		}

	      if(conn == null){
	    	  
	      try {
			conn = DriverManager.getConnection(url+dbName, userName, password);
			System.out.println("conn");
		} catch (SQLException e) {
			String string = "connection failed! \n";
			System.out.println(string);
		}
	      }
	     
		

	
	return conn;
}






public static void closeConnection() 
{

	try {
		if(conn != null)
			conn.close();
	} 
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		String string = "Connection is not closing! \n";
	}
	conn=null;
}

}



