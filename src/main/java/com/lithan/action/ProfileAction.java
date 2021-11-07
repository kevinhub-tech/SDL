package com.lithan.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import User.UserBean;

//import com.lithan.bean.RegisterBean;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

//import org.apache.struts2.ServletActionContext;


public class ProfileAction {
	//private boolean noData = false;
	
/*	public String execute()
	{  
		ResultSet rs = null;
		
		ArrayList<UserBean> list=new ArrayList<UserBean>(); 
		
		//HttpServletRequest request=ServletActionContext.getRequest();  
		//HttpSession session=request.getSession();  
		  
		//String s=(String)session.getAttribute("login");  
		//if(s!=null && !s.equals("")){ 
			try {
				 Class.forName("com.mysql.jdbc.Driver");  
				  Connection con=DriverManager.getConnection(  
						  "jdbc:mysql://127.0.0.1:3306/mini3", "root", "lithanmyanmar");  
				              
				  PreparedStatement ps=con.prepareStatement("select * from register");  
				  rs=ps.executeQuery();  
				  
				  while(rs.next()){  
				   UserBean user=new UserBean();  
				   user.setUsername(rs.getString(1));   
				   user.setEmail(rs.getString(2));
				   user.setPassword(rs.getString(3));
				   user.setContact(rs.getString(4));
				   list.add(user);  
				  }  
				  
				  con.close();  
				 }catch(Exception e){e.printStackTrace();}  
				          
				 return "success"; 
		}  
		//else{  
		   // return "error";  
		//}  
		  
	}

//}*/
	ArrayList<UserBean> list=new ArrayList<UserBean>();  
	  
	public ArrayList<UserBean> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<UserBean> list) {  
	    this.list = list;  
	}  
	public String execute(){  
	 try{ 
		 
	  Class.forName("com.mysql.jdbc.Driver");  
	  Connection con=DriverManager.getConnection(  
			  "jdbc:mysql://127.0.0.1:3306/mini3_project", "root", "");  
	              
	  PreparedStatement ps=con.prepareStatement("select * from register");  
	  ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next()){  
		  UserBean user=new UserBean(); 
       user.setFirstname(rs.getString(1));
       user.setLastname(rs.getString(2));
	   user.setUsername(rs.getString(3));   
	   user.setEmail(rs.getString(4));
	   user.setPassword(rs.getString(5));
	   user.setCountry(rs.getString(6));
	   user.setCity(rs.getString(7));
	   user.setCompanyname(rs.getString(8));
	   user.setAddress(rs.getString(9));
	   list.add(user);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}
