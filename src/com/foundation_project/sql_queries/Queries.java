package com.foundation_project.sql_queries;

public class Queries {
	//ADMIN-QUERIES
	public static String SELECT_ALL_FROM_ADMIN= "SELECT * FROM hotel_management.USERS WHERE USER_role=\"Admin\"";
	public static String SELECT_ALL_FROM_RECEPTION= "SELECT * FROM hotel_management.USERS WHERE USER_ID LIKE \"R%\"";
	public static String SELECT_ALL_FROM_GUEST= "SELECT * FROM hotel_management.USERS WHERE USER_ID LIKE \"G%\"";
	
	
	public static String INSERT_QUERY_FOR_USER = "INSERT INTO hotel_management.USERS(USER_ID,USER_ROLE,USER_NAME,USER_PASSWORD,USER_MOBILE,USER_LAST_MODIFIED) VALUES ( ?,?,?,?,?,?) ";
	public static String UPDATE_QUERY_FOR_USER = "UPDATE hotel_management.USERS SET USER_PASSWORD=? , USER_LAST_MODIFIED=? WHERE USER_ID=? ";
	public static String DELETE_QUERY_FOR_USER = "DELETE FROM hotel_management.USERS WHERE user_id=? ";
	
	
	//USER-QUERIES
	public static String SELECT_ALL_FROM_USER = "SELECT * FROM HOTEL_MANAGEMENT.USERS";
	
	
}
