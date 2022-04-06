import java.sql.*;
import java.util.*;
import java.io.*;

public class DBHandler {

	//Write the required business logic as expected in the question description
	public Connection establishConnection() throws Exception {

		//fill the code
		Connection con ;
		Properties props ;
        try{
            
            props= new Properties();
            FileInputStream fis= new FileInputStream("db.properties");
            props.load(fis);
            Class.forName(props.getProperty("db.classname"));
            con = DriverManager.getConnection(props.getProperty("db.url"),
            props.getProperty("db.username"),props.getProperty("db.password"));
            return con;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
	}
}
