package plane;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connect {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/reproject";
	String un = "root";
	String password = "";
	Connection conn;
	Statement s;

	void server() throws Exception {
		// code to run XAMPP server before jar file execution and connection to server
		try {

			Runtime runtime = Runtime.getRuntime(); // getting Runtime object

			Process process = runtime.exec("C:\\xampp\\xampp-control.exe"); // open xampp

			Thread.sleep(2000);

			process.destroy();
		} catch (Exception e) {

		}
	}

	protected void getConnect() {

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, un, password);
			s = conn.createStatement();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public void append(String sql, String msg) {
		try {
			getConnect();
			s.execute(sql);
			JOptionPane.showMessageDialog(null, "Data " + msg + " Successfully");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

        
        public void appendwithmessage(String sql, String msg) {
		try {
			getConnect();
			s.execute(sql);
			JOptionPane.showMessageDialog(null, msg);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
        
        
        
        
        
	public ResultSet display(String sql) {
		ResultSet rs = null;
		try {
			getConnect();
			rs = s.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}
        public void insert(String sql){
            try{
                getConnect();
                s.execute(sql);
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        
        public void delete(String sql){
            try{
                getConnect();
                s.execute(sql);
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
       
        }

