package demo1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect  {
//	static Connection con;
//	String Driver="com.mysql.cj.jdbc.Driver";
//	String url="jdbc:mysql:localhost:3306/todoapplication";
//	String username="root";
//	String password="root";
//	
//	public Connection conn() throws SQLException, ClassNotFoundException {
//		Class.forName(Driver);
//	
//		Connection con= DriverManager.getConnection(url,username,password);
//		return con;
//}
	
	
	private static final String URL = "jdbc:mysql://localhost:3306/todoapplication";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            throw e;
        }
        return connection;
    }
}