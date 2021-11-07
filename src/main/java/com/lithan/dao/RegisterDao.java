package com.lithan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
	
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

//method for save user data in database
		public int insertdata(String firstname, String lastname, String username, String useremail, String userpassword, String country, String city, String companyname,String address) throws Exception {
			int i = 0;
			try {
				String sql = "INSERT INTO register VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				ps.setString(1, firstname);
				ps.setString(2, lastname);
				ps.setString(3, username);
				ps.setString(4, useremail);
				ps.setString(5, userpassword);
				ps.setString(6, country);
				ps.setString(7, city);
				ps.setString(8, companyname);
				ps.setString(9, address);
				i = ps.executeUpdate();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
				return i;
			} finally {
				if (getConnection() != null) {
					getConnection().close();
				}
			}
		}

}
