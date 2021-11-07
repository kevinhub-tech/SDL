package com.lithan.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	// method for create connection
		public static Connection getConnection() throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mini3_project", "root", "");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
		}
	}
		public static boolean login(String username,String userpassword){  
			 boolean status=false;  
			  try{  
			   
				  String sql = "select * from register where username=? and userpassword=?";
				   PreparedStatement ps = getConnection().prepareStatement(sql);
				   ps.setString(1,username);  
				   ps.setString(2,userpassword);  
				   ResultSet rs=ps.executeQuery();  
				   status=rs.next();  
			  }catch(Exception e){e.printStackTrace();}  
			 return status;  
			}  
		
		public ResultSet profile() throws Exception {
			ResultSet rs = null;
			try{
					String sql = "select * from register";  
					PreparedStatement ps = getConnection().prepareStatement(sql);
					rs=ps.executeQuery();  
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
			return rs;
		}
}

