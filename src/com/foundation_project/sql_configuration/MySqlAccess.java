package com.foundation_project.sql_configuration;

import java.sql.*;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.Date;
//import com.foundation_project.sql_queries.*;

//import com.revature.util.DateTimeUtil;

//import com.revature.constants.Constant;

public class MySqlAccess {
	private static Connection connection=null;
	private static Statement statement=null;
    //private static PreparedStatement preparedStatement = null;
    //private static ResultSet rs = null;

    
    static{
    	try 
    	{
    	
	    	connection=DriverManager.getConnection("jdbc:mysql://localhost/hotel_management","root","Imran799@");
	    	statement = connection.createStatement();
    	}
    	catch(Exception e) {}
    	
    }
    public static Statement getStatement()
	{
		return statement;
	}
    public static Connection getConnection() {
		// TODO Auto-generated method stub
		return connection;
	}
    
    
    
}
    
    
    
    
    
    
    
   	
    
    

