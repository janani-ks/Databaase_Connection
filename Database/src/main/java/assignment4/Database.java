package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Logger;
class Connect{
	Connection con;
	Logger l = Logger.getLogger("com.api.jar");
	private static Connect si = null;
	private Connect() {	
	}
	public static Connect getInstance(){
        if (si == null)
            si = new Connect(); 
        return si;
    }
	void newconnect() {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
  			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Janani7@");
  			Statement stmt=con.createStatement();
            l.info("inserting records");
            String sql="Insert into detail values(56,'subu')";
            stmt.executeUpdate(sql);
		}
		catch(Exception e){
   		 l.info(" "+e);
   		 }
		
	}
	 void close() {
		try {
			l.info("Closes all open connection");
		 con.close();
		 }
		catch(Exception e){
			l.info(" "+e);
		}
}
}
public class Database {
	 public static void main(String[] args){
			Connect c = Connect.getInstance();
	   	    c.newconnect();
	   	    c.close();
		  }
}


