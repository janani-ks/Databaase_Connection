package database;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Database {
	 static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	 public static void main(String[] args){
			Connect c = Connect.getInstance();
	   	    c.newconnect();
	   	    c.close();
		  }
}


